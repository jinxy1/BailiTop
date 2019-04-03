package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class Resource implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 737246566305277688L;
	private int id;
	private String resource_name;
	private String links_resources;
	private String resource_type;
	public Resource() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Resource(int id, String resource_name, String links_resources, String resource_type) {
		super();
		this.id = id;
		this.resource_name = resource_name;
		this.links_resources = links_resources;
		this.resource_type = resource_type;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResource_name() {
		return resource_name;
	}
	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}
	public String getLinks_resources() {
		return links_resources;
	}
	public void setLinks_resources(String links_resources) {
		this.links_resources = links_resources;
	}

	public String getResource_type() {
		return resource_type;
	}

	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
	}
	
	

}
