package com.asiainfo.abdinfo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.ISixDiligenceDao;
import com.asiainfo.abdinfo.dao.PersonnelMapper;
import com.asiainfo.abdinfo.po.Personnel;
import com.asiainfo.abdinfo.po.SixList;
import com.asiainfo.abdinfo.service.PerService; 

@Service("PerService")
public class PerServiceImpl implements PerService{

	@Resource
	private PersonnelMapper permapper;
	
	@Resource
	private ISixDiligenceDao ISixDiligenceDao;


	@Override
	public List<Personnel> findAllPer() {
		// TODO Auto-generated method stub
		return permapper.findAllPer();
	}



	@Override
	public Personnel findByCode(String usercode) {
		// TODO Auto-generated method stub
		return permapper.findByCode(usercode);
	}

	@Override
	public Map<String, Object> findbydaydiligence(String staffcode, String date,String bumen) {
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("staffCode", staffcode);
		map.put("date", date);
		map.put("bumen", bumen);
		List<String> staffCodes=ISixDiligenceDao.findStaffCode(map);
		map.put("staffCodes", staffCodes);
		List<SixList> sixLists=ISixDiligenceDao.find(map);
		System.out.println(sixLists.size());
		map.put("sixLists", sixLists);
		return map;
	}
}
