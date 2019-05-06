package com.asiainfo.abdinfo.po.community;

import java.io.Serializable;

import com.asiainfo.abdinfo.po.Personnel;

public class FlowLeaveWordChild extends Personnel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6213220135964647401L;
	private Integer id;
	private Integer infoLeaveWordId;
	private String staffCode;
	private String receiveStaffCode;
	private String leaveWord;
	private String createTime;
	FlowLeaveWordChild() {
		super();
		// TODO Auto-generated constructor stub
	}
	FlowLeaveWordChild(Integer id, Integer infoLeaveWordId, String staffCode, String receiveStaffCode, String leaveWord,
			String createTime) {
		super();
		this.id = id;
		this.infoLeaveWordId = infoLeaveWordId;
		this.staffCode = staffCode;
		this.receiveStaffCode = receiveStaffCode;
		this.leaveWord = leaveWord;
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "FlowLeaveWordChild [id=" + id + ", infoLeaveWordId=" + infoLeaveWordId + ", staffCode=" + staffCode
				+ ", receiveStaffCode=" + receiveStaffCode + ", leaveWord=" + leaveWord + ", createTime=" + createTime
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getInfoLeaveWordId() {
		return infoLeaveWordId;
	}
	public void setInfoLeaveWordId(Integer infoLeaveWordId) {
		this.infoLeaveWordId = infoLeaveWordId;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getReceiveStaffCode() {
		return receiveStaffCode;
	}
	public void setReceiveStaffCode(String receiveStaffCode) {
		this.receiveStaffCode = receiveStaffCode;
	}
	public String getLeaveWord() {
		return leaveWord;
	}
	public void setLeaveWord(String leaveWord) {
		this.leaveWord = leaveWord;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	
}
