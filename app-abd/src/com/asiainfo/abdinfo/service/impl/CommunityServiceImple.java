package com.asiainfo.abdinfo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.CommunityDao;
import com.asiainfo.abdinfo.dao.FeedBackDao;
import com.asiainfo.abdinfo.po.Community;
import com.asiainfo.abdinfo.po.FlowInfoAccapt;
import com.asiainfo.abdinfo.po.feedback.FeedBackInfo;
import com.asiainfo.abdinfo.service.CommunityService;

@Service("communityServiceImple")
public class CommunityServiceImple implements CommunityService {

	@Autowired
	private CommunityDao communityDao;
	
	@Autowired
	private FeedBackDao feedBackDao;
 
	@Override
	public List<String> getCommunityDep() {

		return communityDao.selectCommunityDep();
	}

	@Override
	public void insertCommunits(Community community) {
		System.out.println(community);
	
		// 插入主表
		communityDao.insertCommunit(community);
		
		// 插入谁可以看
//		System.out.println(community.getArrData());

		// 將List集合中的接收信息
		List<FlowInfoAccapt> list = new ArrayList<FlowInfoAccapt>();
		for (int i = 0; i < community.getArrData().size(); i++) {
			FlowInfoAccapt flowInfoAccapt = new FlowInfoAccapt();
			flowInfoAccapt.setInfoid(community.getId());
			flowInfoAccapt.setInfoAcceptName(community.getArrData().get(i));
			list.add(flowInfoAccapt);
		}

		communityDao.insertInfoAccept(list);

		// 将其他信息插入到数据库中
		if (community.getArrType() != null) {
			for (int i = 0; i < community.getArrType().size(); i++) {
				community.getArrType().get(i).setId(community.getId());
				System.out.println(community);
				communityDao.insertOtherType(community.getArrType());
			}
		}
	}

	@Override
	public void insertInfoImage(Integer infoId, String trueFileName) {
		communityDao.insertInfoImage(infoId, trueFileName);

	}

	/**
	 * 查询类型的名称
	 */
	@Override
	public List<String> getTypeName(String staffCode) {
		return communityDao.selectTypeName(staffCode);
	}

	// @Override
	public List<String> getDepID(String staffCode) {
		// 判断这个人的部门ID
		int depId = communityDao.selectDepID(staffCode);
		// 用来存储该人全部以上的部门
		List<String> list = new ArrayList<String>();
		while (depId != 0) {
			Map<String, String> a = communityDao.selectLevelID(depId);
			list.add(String.valueOf(a.get("dep")));
			depId = Integer.parseInt(String.valueOf(a.get("levelid")));
		}
		return list;
	}

	@Override
	public void getOnid(String department) {
		int depsId = communityDao.selectOnid(department);
		while (depsId != 0) {
		}
	}

	/**
	 * 插入意见反馈
	 */
	@Override
	public Integer insertFeedBack(FeedBackInfo fbIf) {
		return feedBackDao.insertFeedBack(fbIf);
	}

	@Override
	public void insertFeedBackImg(Integer foreign, String trueFileName) {
		feedBackDao.insertFeedBackImg(foreign, trueFileName);
		
	}

	

}
