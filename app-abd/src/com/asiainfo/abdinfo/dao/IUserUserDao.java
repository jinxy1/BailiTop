package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.User;



public interface IUserUserDao {
	
	/**
	 * 登陆
	 * @param map
	 * @return
	 */
	public User findUserByIdAndName(Map<String, Object> map);/**根据人员编码和密码查询个人信息，用于登录页面*/
	
	public List<String>findDepartment(Map<String, Object> map);/**根据人员编码查询所在部门*/
	
	public List<User> findDepartmentPeople(Map<String, Object> map);/**根据部门查询所有的人的信息*/

}
