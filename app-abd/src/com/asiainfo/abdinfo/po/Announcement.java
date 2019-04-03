package com.asiainfo.abdinfo.po;

import java.io.Serializable;
import java.util.Date;

public class Announcement implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//公告ID
	private int id;
	
	//人员编码
	private String staffCode;
	
	//公告内容
	private String title;
	
	//公告发布的开始时间
	private Date startday;
	
	//公告发布的结束时间
	private Date endday;
	
	//状态
	private int state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartday() {
		return startday;
	}

	public void setStartday(Date startday) {
		this.startday = startday;
	}

	public Date getEndday() {
		return endday;
	}

	public void setEndday(Date endday) {
		this.endday = endday;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	@Override
	public String toString() {
		return "Announcement [id=" + id + ", staffCode=" + staffCode
				+ ",  title=" + title
				+ ", startday=" + startday + ", endday=" + endday + ", state="
				+ state + "]";
	}

	

	
}
