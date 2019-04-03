package com.asiainfo.abdinfo.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.asiainfo.abdinfo.dao.ISixDiligenceDao;
import com.asiainfo.abdinfo.dao.ITipsDao;
import com.asiainfo.abdinfo.po.Menus;
import com.asiainfo.abdinfo.po.Types;
import com.asiainfo.abdinfo.po.User;
import com.asiainfo.abdinfo.po.Works;
import com.asiainfo.abdinfo.service.ITipsService;

@Service("ITipsService")

public class TipsServiceImpl implements ITipsService{
	
	@Resource
	private ITipsDao tipsDao;
	
	@Resource
	private ISixDiligenceDao sixDiligenceDao;
	/**添加今日感想、反省、善行、工作总结等内容*/
	@Override
	@Transactional
	public int addTipsDailyfeeling(Map<String, Object> map) {
		
		try {
			List<Menus> list=new ArrayList<>();
			List<Types> types=sixDiligenceDao.types(map);
			JSONArray tipsArray=JSONArray.parseArray((String)map.get("tips"));//感想、感性、感恩其他
			if (types.size()==0) {
				for (Object object : tipsArray) {
					String str=object.toString();
					Menus menus=(Menus)JSON.parseObject(str,Menus.class);
					if (!menus.getContent().equals("")) {
						list.add(menus);
					}
				};
				if (list.size()!=0) {
					map.put("listAddM", list);
					tipsDao.addTipsDailyfeeling(map);
				}
			}else{
				for (Object object : tipsArray) {
					int i=0;
					String str=object.toString();
					Menus menus=(Menus)JSON.parseObject(str,Menus.class);
					for (Types type : types) {
						if (type.getType().equals(menus.getType())) {
							i++;
							if (!type.getContent().equals(menus.getContent())) {
								map.put("type", menus.getType());
								map.put("content", menus.getContent());
								tipsDao.updateTipsDailyfeeling(map);
							}
						}
					};
					if (i==0&&!menus.getContent().equals("")) {
						list.add(menus);
					}
				};
				if (list.size()!=0) {
					map.put("listAddM", list);
					tipsDao.addTipsDailyfeeling(map);
				};
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e);
		}
		return 0;
	}
	/**更新自主内容*/
	@Override
	public int addCustom_reflection(Map<String, Object> map){
		String customStr=(String)map.get("customcontent");
		//
		Menus menusCustom=(Menus)JSON.parseObject(customStr,Menus.class);
		map.put("customcontent", menusCustom.getContent());
		map.put("customtype", menusCustom.getType());
		tipsDao.updateCustomContent(map);
		return 0;
	}
	/**添加感恩*/
	@Override
	@Transactional
	public int addOwn(Map<String, Object> map){
		JSONArray jsonArray=JSONArray.parseArray((String)map.get("menus"));//感恩内容
		List<Menus> list=tipsDao.getOwes_content(map);
		List<Menus> menu=new ArrayList<>();
		if (list.size()==0) {
			for (Object object : jsonArray) {
				String str=object.toString();
				System.out.println(str);
				Menus menus=(Menus)JSON.parseObject(str,Menus.class);
				if (!menus.getPers().equals("")&&!menus.getDetail().equals("")) {
					menu.add(menus);
				}
			};
			if (menu.size()!=0) {
				map.put("menu", menu);
				tipsDao.addTipsOwes_content(map);
			}
		}else{
			for (Object object : jsonArray) {
				int i=0;
				String str=object.toString();
				System.out.println(str);
				Menus menus=(Menus)JSON.parseObject(str,Menus.class);
				for (Menus menuList : list) {
					if (menuList.getPers().equals(menus.getPers())) {
						i++;
						if (!menus.getDetail().equals("")) {
							map.put("menu", menus);
							tipsDao.updateOwes_content(map);
						}
					}
				}
				if (i==0&&!menus.getPers().equals("")&&!menus.getDetail().equals("")) {
					menu.add(menus);
				}
			};
			
			if(menu.size()!=0){
				map.put("menu", menu);
				tipsDao.addTipsOwes_content(map);
			}
		}
		return 0;
	}
	/**查询所有人的姓名信息用于模糊查询*/
	@Override
	public List<User> findTips(Map<String, Object> map) {
		return tipsDao.findTips(map);
	}
	/**根据id删除感恩人信息*/
	@Override
	public int deleteTipsOwes_content(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tipsDao.deleteTipsOwes_content(map);
	}
	/**根据id删除工作总结*/
	@Override
	public int deleteWork(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tipsDao.deleteById(map);
	}
	@Override
	public int updateWork(Map<String, Object> map) {
		Works works=(Works)JSON.parseObject(map.get("editWork").toString(),Works.class);
		map.put("work", works);
		return tipsDao.updateWorkSummary(map);
	}
	@Override
	public int addWorkSummary(Map<String, Object> map) {
			Works works=(Works)JSON.parseObject(map.get("workList").toString(),Works.class);
			map.put("work", works);
			System.out.println(map.get("codeStr").toString());
			if (map.get("codeStr").toString().equals("1")) {
				tipsDao.addWorkPlan(map);
			}else{
				if (works.getId()!=null) {
					tipsDao.updateWorkSummary(map);
				}else {
					tipsDao.addWorkSummary(map);
				}
			}
		return 0;
	}
	@Override
	public int updateWorkStutas(Map<String, Object> map) {
		
		return tipsDao.updateWorkStutas(map);
	}
	

	

	


}
