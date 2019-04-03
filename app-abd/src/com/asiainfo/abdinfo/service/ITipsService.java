package com.asiainfo.abdinfo.service;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.User;

public interface ITipsService {
	
	public int addTipsDailyfeeling(Map<String, Object> map);/**添加今日感想、反省、善行等内容*/
	public List<User> findTips(Map<String, Object> map);/**查询所有人的姓名信息*/
	public int deleteTipsOwes_content(Map<String, Object> map);/**根据id删除感恩人信息*/
	public int deleteWork(Map<String, Object> map);/**根据id删除工作总结*/
	public int updateWork(Map<String, Object> map);/**根据id更新工作总结*/
	public int addWorkSummary(Map<String, Object> map);/**添加工作总结*/
	public int updateWorkStutas(Map<String, Object> map);/**修改工作状态*/
	public int addOwn(Map<String, Object> map);/**添加感恩*/
	public int addCustom_reflection(Map<String, Object> map);/**添加感恩*/
}
