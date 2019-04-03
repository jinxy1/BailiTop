package com.asiainfo.abdinfo.po;

import java.io.Serializable;

/**用于日精进页面查询内容的数据封装*/
public class Type implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6859336229784340051L;
	private String Customtype;
	private String Customcontent;
	private String date;
	private String stutas;
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type(String customtype, String customcontent, String date, String stutas) {
		super();
		Customtype = customtype;
		Customcontent = customcontent;
		this.date = date;
		this.stutas = stutas;
	}
	public String getCustomtype() {
		return Customtype;
	}
	public void setCustomtype(String customtype) {
		Customtype = customtype;
	}
	public String getCustomcontent() {
		return Customcontent;
	}
	public void setCustomcontent(String customcontent) {
		Customcontent = customcontent;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStutas() {
		return stutas;
	}
	public void setStutas(String stutas) {
		this.stutas = stutas;
	}
	@Override
	public String toString() {
		return "Type [Customtype=" + Customtype + ", Customcontent=" + Customcontent + ", date=" + date + ", stutas="
				+ stutas + "]";
	}
	
}
