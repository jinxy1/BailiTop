package com.asiainfo.abdinfo.po;

import java.io.Serializable;

/**
 * 日计划
 * @author jxy
 *
 */
public class DayPlan implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Integer parentID;
	
	private String name;
	
	private Integer sort;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentID() {
		return parentID;
	}

	public void setParentID(Integer parentID) {
		this.parentID = parentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "DayPlan [id=" + id + ", parentID=" + parentID + ", name=" + name + ", sort=" + sort + "]";
	}
	
	

}
