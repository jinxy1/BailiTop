package com.asiainfo.abdinfo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.IMassageDao;
import com.asiainfo.abdinfo.po.Massage;
import com.asiainfo.abdinfo.po.PageBean;
import com.asiainfo.abdinfo.service.IMassageService;
import com.asiainfo.abdinfo.utils.mybatis.paginator.domain.PageBounds;
import com.github.pagehelper.PageHelper;
@Service
public class MassageServiceImpl implements IMassageService{
	
	@Resource
	private IMassageDao iMassageDao;
	/**查询信息流内容*/
	@Override
	public PageBean<Massage> findMassage(Map<String, Object> map,PageBounds pb) {
		PageHelper.startPage(pb.getPage(), pb.getLimit());
		List<Massage> massages=iMassageDao.findMassage(map);
		PageBean<Massage>  pageBean  = new PageBean<Massage>(massages);
		return pageBean;
	}
	/**查询未读信息流数量*/
	@Override
	public Integer findCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return iMassageDao.findCount(map);
	}
	/**更新未读信息流状态*/
	@Override
	public int updateMassage(Map<String, Object> map) {
		
		return iMassageDao.updateMassage(map);
	}

}
