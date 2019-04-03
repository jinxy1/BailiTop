package com.asiainfo.abdinfo.po;

import java.io.Serializable;
import java.util.Date;

public class Menus implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 366097693828797330L;
	private Integer id;
	private String pers;
	private String detail;
	private String staffCodeOther;
	private String type;
	private String content;
	private Integer new_id;
	private Date date;//时间
	public Menus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Menus(Integer id, String pers, String detail, String staffCodeOther, String type, String content,
			Integer new_id, Date date) {
		super();
		this.id = id;
		this.pers = pers;
		this.detail = detail;
		this.staffCodeOther = staffCodeOther;
		this.type = type;
		this.content = content;
		this.new_id = new_id;
		this.date = date;
	}

	public String getPers() {
		return pers;
	}



	public Integer getNew_id() {
		return new_id;
	}
	public void setNew_id(Integer new_id) {
		this.new_id = new_id;
	}
	public void setPers(String pers) {
		this.pers = pers;
	}
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDetail() {
		return detail;
	}




	public void setDetail(String detail) {
		this.detail = detail;
	}




	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getStaffCodeOther() {
		return staffCodeOther;
	}

	public void setStaffCodeOther(String staffCodeOther) {
		this.staffCodeOther = staffCodeOther;
	}
	
	
}
