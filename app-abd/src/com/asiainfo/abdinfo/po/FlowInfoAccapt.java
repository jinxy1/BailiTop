package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class FlowInfoAccapt implements Serializable{

	
	private static final long serialVersionUID = -1985119048098685920L;
	
	private Integer id;
	
	private Integer infoid;   //表的外鍵
	
	private String infoAcceptName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInfoid() {
		return infoid;
	}

	public void setInfoid(Integer infoid) {
		this.infoid = infoid;
	}

	public String getInfoAcceptName() {
		return infoAcceptName;
	}

	public void setInfoAcceptName(String infoAcceptName) {
		this.infoAcceptName = infoAcceptName;
	}

	@Override
	public String toString() {
		return "FlowInfoAccapt [id=" + id + ", infoid=" + infoid + ", infoAcceptName=" + infoAcceptName + "]";
	}
	
	
	

}
