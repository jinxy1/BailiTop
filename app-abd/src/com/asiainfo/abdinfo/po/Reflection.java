package com.asiainfo.abdinfo.po;

public class Reflection {
	private String id ; 
	private String staffCode ; 
	private String department ; 
	private String date ; 
	private String types ; 
	private String content ; 
	private String createTime ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Reflection [id=" + id + ", staffCode=" + staffCode
				+ ", department=" + department + ", date=" + date + ", types="
				+ types + ", content=" + content + ", createTime=" + createTime
				+ "]";
	}
	
}
