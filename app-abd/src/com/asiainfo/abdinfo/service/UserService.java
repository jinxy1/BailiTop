package com.asiainfo.abdinfo.service;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.User;

public interface UserService {

	
	public User getUserByIdAndName(Map<String, Object> map);
	
	public List<String>getDepartment(Map<String, Object> map);
	
	public List<User> getDepartmentPeople(Map<String, Object> map);
	
}
