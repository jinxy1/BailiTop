package com.asiainfo.abdinfo.po;

import java.io.Serializable;

/**
 * 基本信息
 * @author jinxy
 *
 */
public class BaseInformation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String areaName;
	
	private String priority;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "BaseInformation [id=" + id + ", areaName=" + areaName + ", priority=" + priority + "]";
	}
	
	

	
	
	
	
	

}
