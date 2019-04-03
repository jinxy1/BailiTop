package com.asiainfo.abdinfo.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SixDiligence implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 886530698063797140L;
	private Integer id;
	private List<Menus> menus;//感恩他人信息
	private List<Types> types;//六项精进类型
	private List<Menus> customContent;//感恩他人信息
	private Date date;//时间
	private String department;//部门
	private String staffName;//姓名
	private String clockIn;//打卡天数
	private String bookNames;//书名
	private String chapters;//章节名称
	private String ceshi;//读书感悟
	private List<Works> works;//工作内容
	private List<Custom_reflection> custom_reflection;
	public SixDiligence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SixDiligence(Integer id, List<Menus> menus, List<Types> types, List<Menus> customContent, Date date,
			String department, String staffName, String clockIn, String bookNames, String chapters, String ceshi,
			List<Works> works, List<Custom_reflection> custom_reflection) {
		super();
		this.id = id;
		this.menus = menus;
		this.types = types;
		this.customContent = customContent;
		this.date = date;
		this.department = department;
		this.staffName = staffName;
		this.clockIn = clockIn;
		this.bookNames = bookNames;
		this.chapters = chapters;
		this.ceshi = ceshi;
		this.works = works;
		this.custom_reflection = custom_reflection;
	}

	public List<Menus> getMenus() {
		return menus;
	}
	public List<Types> getTypes() {
		return types;
	}
	public void setTypes(List<Types> types) {
		this.types = types;
	}
	public void setMenus(List<Menus> menus) {
		this.menus = menus;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getClockIn() {
		return clockIn;
	}
	public void setClockIn(String clockIn) {
		this.clockIn = clockIn;
	}
	public String getBookNames() {
		return bookNames;
	}
	public void setBookNames(String bookNames) {
		this.bookNames = bookNames;
	}
	public String getChapters() {
		return chapters;
	}
	public void setChapters(String chapters) {
		this.chapters = chapters;
	}
	public String getCeshi() {
		return ceshi;
	}
	public void setCeshi(String ceshi) {
		this.ceshi = ceshi;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public List<Works> getWorks() {
		return works;
	}
	public void setWorks(List<Works> works) {
		this.works = works;
	}
	public List<Menus> getCustomContent() {
		return customContent;
	}
	public void setCustomContent(List<Menus> customContent) {
		this.customContent = customContent;
	}

	public List<Custom_reflection> getCustom_reflection() {
		return custom_reflection;
	}

	public void setCustom_reflection(List<Custom_reflection> custom_reflection) {
		this.custom_reflection = custom_reflection;
	}
	
}
