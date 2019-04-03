package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class Types implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4200926018033656275L;
	private Integer id;
	private String type;
	private String content="";
	public Types() {
		super();
		// TODO Auto-generated constructor stub
	}
	Types(Integer id, String type, String content) {
		super();
		this.id = id;
		this.type = type;
		this.content = content;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Types [id=" + id + ", type=" + type + ", content=" + content + "]";
	}
	
}
