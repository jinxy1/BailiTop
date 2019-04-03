package com.asiainfo.abdinfo.po.demo;

import java.io.Serializable;

public class DataDistribution implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7403418865208061531L;
	private Integer id;
	private String name;
	private Integer value;
	DataDistribution() {
		super();
		// TODO Auto-generated constructor stub
	}
	DataDistribution(Integer id, String name, Integer value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}
	@Override
	public String toString() {
		return "DataDistribution [id=" + id + ", name=" + name + ", value=" + value + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
}
