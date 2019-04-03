package com.asiainfo.abdinfo.service;

import java.util.Map;

import com.asiainfo.abdinfo.po.Massage;
import com.asiainfo.abdinfo.po.PageBean;
import com.asiainfo.abdinfo.utils.mybatis.paginator.domain.PageBounds;

public interface IMassageService {
	
	public PageBean<Massage> findMassage(Map<String, Object> map,PageBounds pb);/**查询所有信息流*/
	public Integer findCount(Map<String, Object> map);/**查询未读信息流的数量*/
	public int updateMassage(Map<String, Object> map);/**更新未读信息的状态*/

}
