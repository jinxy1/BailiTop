package com.asiainfo.abdinfo.service;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.Menus;
import com.asiainfo.abdinfo.po.PageBean;
import com.asiainfo.abdinfo.po.SixDiligence;
import com.asiainfo.abdinfo.utils.mybatis.paginator.domain.PageBounds;

public interface ISixDiligenceService {
	
	public Map<String, Object> findSixDiligence(Map<String, Object> map);
	public PageBean<SixDiligence> findReadingFeeling(Map<String, Object> map,PageBounds pb);
	public PageBean<SixDiligence> findTips(Map<String, Object> map,PageBounds pb);
	public List<Menus> findCustomcontent(Map<String, Object> map);//根据时间查找自主内容
	/**查询部门或者事业部的日总结或者感想*/
	public Map<String, Object> findbydaydiligence(String staffcode,String date,String bumen);

}
