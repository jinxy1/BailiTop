package com.asiainfo.abdinfo.po;

import java.io.Serializable;
import java.util.Date;

public class Works implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5778657439139609236L;
	private Integer id;
	private String work;
	private String projectType;
	private String entry_name;
	private String planTime;
	private Date date;//时间
	private String stutas;
	public Works() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public String getEntry_name() {
		return entry_name;
	}
	public void setEntry_name(String entry_name) {
		this.entry_name = entry_name;
	}
	public String getPlanTime() {
		return planTime;
	}
	public void setPlanTime(String planTime) {
		this.planTime = planTime;
	}
	public String getStutas() {
		return stutas;
	}
	public void setStutas(String stutas) {
		this.stutas = stutas;
	}
	public Works(Integer id, String work, String projectType, String entry_name, String planTime, Date date,
			String stutas) {
		super();
		this.id = id;
		this.work = work;
		this.projectType = projectType;
		this.entry_name = entry_name;
		this.planTime = planTime;
		this.date = date;
		this.stutas = stutas;
	}
	
	

}
