package com.asiainfo.abdinfo.po.NewLoginBean;

import java.io.Serializable;

public class OtherAdd implements Serializable{

	private static final long serialVersionUID = -4697747009814961071L;
	
	private Integer id;
	
	private String contentother;
	
	private String  name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContentother() {
		return contentother;
	}

	public void setContentother(String contentother) {
		this.contentother = contentother;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "OtherAdd [id=" + id + ", contentother=" + contentother + ", name=" + name + "]";
	}

	
	
	

}
