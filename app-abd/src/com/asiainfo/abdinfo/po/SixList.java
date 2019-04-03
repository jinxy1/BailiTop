package com.asiainfo.abdinfo.po;

import java.io.Serializable;
import java.util.List;
/**用于日精进页面查询数据的封装*/
public class SixList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1424726356930977487L;
	private String date;//对应时间
	private String staffCode;
	private List<Custom_reflection> custom_reflections;
	public SixList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getStaffCode() {
		return staffCode;
	}
	public SixList(String date, String staffCode, List<Custom_reflection> custom_reflections) {
		super();
		this.date = date;
		this.staffCode = staffCode;
		this.custom_reflections = custom_reflections;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public List<Custom_reflection> getCustom_reflections() {
		return custom_reflections;
	}

	public void setCustom_reflections(List<Custom_reflection> custom_reflections) {
		this.custom_reflections = custom_reflections;
	}
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
