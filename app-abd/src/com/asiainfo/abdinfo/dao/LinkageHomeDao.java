package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.ReadClock;
/** 首页点击封面获取书单 */
public interface LinkageHomeDao {
	
	public List<ReadClock> findLinkage(Map<String,Object> map);

}
