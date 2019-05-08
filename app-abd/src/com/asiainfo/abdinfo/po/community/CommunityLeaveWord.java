package com.asiainfo.abdinfo.po.community;

import java.io.Serializable;
import java.util.List;

import com.asiainfo.abdinfo.po.Personnel;

public class CommunityLeaveWord extends Personnel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6285249957379876514L;
	private Integer id;
	private Integer infoId;
	private String leaveWord;
	private String createTime;
	private String staffCode;
	private List<FlowLeaveWordChild> fChild;
	CommunityLeaveWord() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CommunityLeaveWord [id=" + id + ", infoId=" + infoId + ", leaveWord=" + leaveWord + ", createTime="
				+ createTime + ", staffCode=" + staffCode + ", fChild=" + fChild + "]";
	}
	CommunityLeaveWord(Integer id, Integer infoId, String leaveWord, String createTime, String staffCode,
			List<FlowLeaveWordChild> fChild) {
		super();
		this.id = id;
		this.infoId = infoId;
		this.leaveWord = leaveWord;
		this.createTime = createTime;
		this.staffCode = staffCode;
		this.fChild = fChild;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
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
	public List<FlowLeaveWordChild> getfChild() {
		return fChild;
	}
	public void setfChild(List<FlowLeaveWordChild> fChild) {
		this.fChild = fChild;
	}
}
