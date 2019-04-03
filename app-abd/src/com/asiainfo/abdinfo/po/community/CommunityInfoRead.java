package com.asiainfo.abdinfo.po.community;

import java.io.Serializable;

public class CommunityInfoRead implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4196615392715039066L;
	private Integer id;
	private Integer infoId;
	private Integer status;
	private String staffCode;
	private String infoType;
	public CommunityInfoRead() {
		super();
		// TODO Auto-generated constructor stub
	}
	CommunityInfoRead(Integer id, Integer infoId, Integer status, String staffCode, String infoType) {
		super();
		this.id = id;
		this.infoId = infoId;
		this.status = status;
		this.staffCode = staffCode;
		this.infoType = infoType;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getInfoId() {
		return infoId;
	}
	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getInfoType() {
		return infoType;
	}
	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}
	@Override
	public String toString() {
		return "CommunityInfoRead [id=" + id + ", infoId=" + infoId + ", status=" + status + ", staffCode=" + staffCode
				+ ", infoType=" + infoType + "]";
	}
	
	
}
