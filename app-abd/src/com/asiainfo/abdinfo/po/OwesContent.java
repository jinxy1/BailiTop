package com.asiainfo.abdinfo.po;

public class OwesContent {
	private String department ; 
	private String staffCode ; 
	private String date ; 
	private String owePerson ; 
	private String oweDetails ; 
	private String id ; 
	private String createTime ; 
	private String staffCodeOther ; 
	private String newid ;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getOwePerson() {
		return owePerson;
	}
	public void setOwePerson(String owePerson) {
		this.owePerson = owePerson;
	}
	public String getOweDetails() {
		return oweDetails;
	}
	public void setOweDetails(String oweDetails) {
		this.oweDetails = oweDetails;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getStaffCodeOther() {
		return staffCodeOther;
	}
	public void setStaffCodeOther(String staffCodeOther) {
		this.staffCodeOther = staffCodeOther;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNewid() {
		return newid;
	}
	public void setNewid(String newid) {
		this.newid = newid;
	}
	@Override
	public String toString() {
		return "OwesContent [department=" + department + ", staffCode="
				+ staffCode + ", date=" + date + ", owePerson=" + owePerson
				+ ", oweDetails=" + oweDetails + ", id=" + id + ", createTime="
				+ createTime + ", staffCodeOther=" + staffCodeOther
				+ ", newid=" + newid + "]";
	}
}
