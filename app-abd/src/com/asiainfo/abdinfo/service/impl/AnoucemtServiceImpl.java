package com.asiainfo.abdinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.AnoucemtDao;
import com.asiainfo.abdinfo.po.Announcement;
import com.asiainfo.abdinfo.service.AnoucemtService;
/**公告内容的实现类*/
@Service("AnoucemtService")
public class AnoucemtServiceImpl implements AnoucemtService{

	@Resource
	private AnoucemtDao actd;
	@Override
	public List<Announcement> nowdaytitle(String nowday) {
		// TODO Auto-generated method stub
		List<Announcement> list=actd.nowdaytitle(nowday);
		return list;
	}

}
