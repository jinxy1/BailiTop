package com.asiainfo.abdinfo.po;

import java.io.Serializable;
import java.util.List;

/**用于日精进页面查询内容的数据封装*/
public class Custom_reflection implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7837483513888294883L;
	private String department;
	private List<Type> type;
	public Custom_reflection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Custom_reflection(String department, List<Type> type) {
		super();
		this.department = department;
		this.type = type;
	}


	public List<Type> getType() {
		return type;
	}

	public void setType(List<Type> type) {
		this.type = type;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
