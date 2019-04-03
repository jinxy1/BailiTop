package com.asiainfo.abdinfo.po.community;

import java.io.Serializable;

public class CommunityAuthority implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6786395157148076513L;
	private Integer id;
	private String staffCode;
	private String role;
	CommunityAuthority() {
		super();
		// TODO Auto-generated constructor stub
	}
	CommunityAuthority(Integer id, String staffCode, String role) {
		super();
		this.id = id;
		this.staffCode = staffCode;
		this.role = role;
	}
	@Override
	public String toString() {
		return "CommunityAuthority [id=" + id + ", staffCode=" + staffCode + ", role=" + role + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
