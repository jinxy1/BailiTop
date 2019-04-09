package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.Custom_reflection;
import com.asiainfo.abdinfo.po.Menus;
import com.asiainfo.abdinfo.po.SixDiligence;
import com.asiainfo.abdinfo.po.SixList;
import com.asiainfo.abdinfo.po.Types;
import com.asiainfo.abdinfo.po.Works;
public interface ISixDiligenceDao {
	
	//查询六项精进打卡内容
	public List<SixDiligence> findSixDiligence(Map<String, Object> map);
	
	public List<SixDiligence> findTips(Map<String, Object> map);//查找全部感恩人
	public List<SixDiligence> findReadFeeling(Map<String, Object> map);//根据有没有时间参数查找读书感悟
	public List<SixDiligence> findWork(Map<String, Object> map);//查找全部工作内容
	public List<Menus> findMenus(Map<String, Object> map);//根据时间查找找感恩人
	public List<Works> findworks(Map<String, Object> map);//根据时间查找工作内容
	public List<Menus> findCustomcontent(Map<String, Object> map);//根据时间查找自主内容
	public List<String> findStaffCode(Map<String, Object> map);//根据人员编码查找部门或者事业部的所有人的人员编码 
	
	public List<SixList> find(Map<String, Object> map);//查询六项精进"今日感想","今日反省","今日善行","感恩其他"
	
	public List<Custom_reflection> findMyDay(Map<String, Object> map);//我的页面查新感想、精进等内容
	
	public List<Types> types(Map<String, Object> map);
}
