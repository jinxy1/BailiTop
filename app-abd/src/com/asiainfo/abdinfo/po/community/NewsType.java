package com.asiainfo.abdinfo.po.community;

import java.io.Serializable;

public class NewsType implements Serializable{

	private static final long serialVersionUID = 3704691314764504587L;
	
	private String eNmae;
	
	private String cName;
	
	

	public NewsType() {
		super();
	}

	public NewsType(String eNmae, String cName) {
		super();
		this.eNmae = eNmae;
		this.cName = cName;
	}

	public String geteNmae() {
		return eNmae;
	}

	public void seteNmae(String eNmae) {
		this.eNmae = eNmae;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "NewsType [eNmae=" + eNmae + ", cName=" + cName + "]";
	}
	
	

}
