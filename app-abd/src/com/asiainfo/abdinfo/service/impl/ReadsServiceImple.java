package com.asiainfo.abdinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.ReadBookDao;
import com.asiainfo.abdinfo.po.reads.Readingbook;
import com.asiainfo.abdinfo.service.ReadsService;

@Service("readsServiceImple")
public class ReadsServiceImple implements ReadsService{
	
	@Autowired  
	private ReadBookDao readBookDao;

	@Override
	public List<Readingbook> bookRead() {
		return readBookDao.findBooked();
	}

	@Override
	public String getTotalTime(String staffCode) {
		
		return readBookDao.selectTotalTime(staffCode);
	}

}
