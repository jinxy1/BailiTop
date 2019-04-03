package com.asiainfo.abdinfo.po.feedback;

import java.io.Serializable;

public class FeedBackInfo implements Serializable{

	private static final long serialVersionUID = 5682195902855650894L;
	
	private Integer id;
	
	private String staffCode;
	
	private String content;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "FeedBackInfo [id=" + id + ", staffCode=" + staffCode + ", content=" + content + "]";
	}
	
	

}
