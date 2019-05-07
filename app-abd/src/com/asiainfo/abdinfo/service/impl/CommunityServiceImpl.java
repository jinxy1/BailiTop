package com.asiainfo.abdinfo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.ICommunityDao;
import com.asiainfo.abdinfo.po.PageBean;
import com.asiainfo.abdinfo.po.User;
import com.asiainfo.abdinfo.po.community.CommunityInfo;
import com.asiainfo.abdinfo.po.community.CommunityInfoRead;
import com.asiainfo.abdinfo.po.community.CommunityInfoType;
import com.asiainfo.abdinfo.po.community.CommunityLeaveWord;
import com.asiainfo.abdinfo.po.community.FlowLeaveWordChild;
import com.asiainfo.abdinfo.service.ICommunityService;
import com.asiainfo.abdinfo.utils.mybatis.paginator.domain.PageBounds;
import com.github.pagehelper.PageHelper;

@Service("communityServiceImpl")
public class CommunityServiceImpl implements ICommunityService{
	
	@Autowired
	private ICommunityDao icommunityDao;
	
	@Override
	public Map<String, Object> getCommunityMsType(User user,String typeName,PageBounds pb,String infoTitle) {
		long start=System.currentTimeMillis();
		List<CommunityInfoType> communityInfoTypes=icommunityDao.getCommunityMsgType();
		List<CommunityInfoType> unlessMsgCount =icommunityDao.getUnlessMsgCount(user);
		String authority=icommunityDao.getAuthority(user.getStaffCode());
		for (CommunityInfoType communityInfoType : communityInfoTypes) {
			for (CommunityInfoType InfoType : unlessMsgCount) {
				if (InfoType.getTypeName().equals(communityInfoType.getTypeName())) {
					communityInfoType.setUnreadCount(InfoType.getUnreadCount());
				}
			}
		}
		int unreadCount=0;
		for (CommunityInfoType communityInfoType : unlessMsgCount) {
			unreadCount=unreadCount+communityInfoType.getUnreadCount();
		}
		PageHelper.startPage(pb.getPage(), pb.getLimit());
		List<CommunityInfo> communityInfos=icommunityDao.getCommunityMsg(user,typeName,infoTitle);
		for (CommunityInfo communityInfo : communityInfos) {
			String time=communityInfo.getInfoCurrentTime();
			time=time.substring(0,19);
			communityInfo.setInfoCurrentTime(time);
		}
		PageBean<CommunityInfo>  pageBean=new PageBean<CommunityInfo>(communityInfos);
		Map<String, Object> map =new HashMap<>();
		map.put("communityInfoTypes", communityInfoTypes);
		map.put("pageBean", pageBean);
		map.put("unreadCount", unreadCount);
		map.put("authority", authority);
		long end=System.currentTimeMillis();
		System.out.println("用时："+(end-start));
		return map;
	}
	/**更改未读信息的状态*/
	@Override
	public Integer changeReadStatus(CommunityInfoRead communityInfoRead) {
		Integer num=getReadCount(communityInfoRead);
		if (num<1) {
			num=icommunityDao.addReadInfo(communityInfoRead);
		}
		return num;
	}
	/**更改未读信息时像flow_info_read表中插入一条信息，在更改未读信息判断是否已经插入此信息的状态*/
	@Override
	public Integer getReadCount(CommunityInfoRead communityInfoRead) {
		Integer num=icommunityDao.getReadInfo(communityInfoRead);
		return num;
	}
	/**未读信息数量*/
	@Override
	public Integer getunlessMsgCount(User user) {
		List<CommunityInfoType> unlessMsgCount =icommunityDao.getUnlessMsgCount(user);
		int unreadCount=0;
		for (CommunityInfoType communityInfoType : unlessMsgCount) {
			unreadCount=unreadCount+communityInfoType.getUnreadCount();
		}
		return unreadCount;
	}
	
	/**一键已读*/
	@Override
	public Integer infoRead(User user){
		List<Integer> ids=icommunityDao.getUnlessMsgId(user);
		if (ids.size()!=0) {
			icommunityDao.addReadInfos(ids,user.getStaffCode());
		}
		return 1;
	}
	/**更新积分状态*/
	@Override
	public Integer updateIntegralStatus(Integer infoId, String staffCode) {
		// TODO Auto-generated method stub
		return icommunityDao.updateIntegralStatus(infoId, staffCode);
	}
	@Override
	public Integer addLeaveWord(CommunityLeaveWord cLeaveWord) {
		// TODO Auto-generated method stub
		return icommunityDao.addLeaveWord(cLeaveWord);
	}
	@Override
	public List<CommunityLeaveWord> findLeaveWord(Integer infoId) {
		// TODO Auto-generated method stub
		return icommunityDao.findLeaveWord(infoId);
	}
	@Override
	public Integer addRecoverStruct(FlowLeaveWordChild fLeaveWordChild) {
		// TODO Auto-generated method stub
		return icommunityDao.addRecoverStruct(fLeaveWordChild);
	}

}
