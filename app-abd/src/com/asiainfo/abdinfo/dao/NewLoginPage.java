package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;
import com.asiainfo.abdinfo.po.NewLoginBean.NewLogin;

public interface NewLoginPage {
	
	/*插入用户信息*/
	void insertUser(Map<String,Object> map);
	
	
	void deleteUser(Map<String,Object> map);
	
	/**
	 * 查询用户
	 * @param map
	 * @return
	 */
	public List<NewLogin> findUser(Map<String,Object> map);
	
	/**
	 * 注册 即更新
	 * @param map
	 */
	void updateUser(Map<String,Object> map);
	
	void updateUserNewe(Map<String,Object> map);
	
	/*
	 * 查询用户新
	 */
	List<NewLogin> findNewUser(@Param(value="openId") String openId);
	
	
	
	/**
	 * 用于展示用户的感想
	 */
	List<ListAllFeeling> findAllFeeling(Map<String,Object> map);
	
	/**
	 * 查询员工编码
	 * @param map
	 * @return
	 */
	List<NewLogin> selectUser(Map<String,Object> map);
	
	/**
	 * 根据openId删除不同于现在openId的用户，主要用于openId变化时
	 * */
	void deleteUserByOpenId(Map<String,Object> map);
	/**
	 * 用于头像的显示
	 * */
	ListAllFeeling findbaseByCode(Map<String,Object> map);
}





