package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.Menus;
import com.asiainfo.abdinfo.po.User;

public interface ITipsDao {
	
	public int addTipsDailyfeeling(Map<String, Object> map);
	/**
	 * 韩启龙到此一游
	 * @param map
	 * @return
	 */
	public int addTipsOwes_content(Map<String, Object> map);
	public List<User> findTips(Map<String, Object> map);/**查询个人信息或者公司的全部信息*/
	public int updateTipsDailyfeeling(Map<String, Object> map);/**更新感想、反省等信息 */
	public int deleteTipsOwes_content(Map<String, Object> map);/**根据id删除感恩人信息*/
	public int updateCustomContent(Map<String, Object> map);/**更新自主内容*/
	public int deleteOwes_content(Map<String, Object> map);/**再次提交删除之前的感恩信息，添加当前的感恩信息*/
	public void delwkl(Map<String, Object> map);/**再次提交删除之前工作总结*/
	public int addWorkSummary(Map<String, Object> map);/**添加工作总结*/
	public int deleteById(Map<String, Object> map);/**删除单条工作总结*/
	public int updateWorkSummary(Map<String, Object> map);/**根据id更新工作总结*/
	public int addWorkPlan(Map<String, Object> map);/**添加工作计划*/
	public int updateWorkStutas(Map<String, Object> map);/**修改工作状态*/
	public List<Menus> getOwes_content(Map<String, Object> map);/**查询当天是否插入感恩*/
	public int updateOwes_content(Map<String, Object> map);/**更新感恩人信息*/
	

}
