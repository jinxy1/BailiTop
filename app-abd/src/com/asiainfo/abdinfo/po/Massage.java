package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class Massage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String addresseeCode;//收信人的人员编码
	private String senderCode;//发信人的人员编码
	private String date;//时间
	private String type;//类型
	private String content;//内容
	private String stutas;//状态
	private String name;//姓名
	public Massage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Massage(Integer id, String addresseeCode, String senderCode, String date, String type, String content,
			String stutas, String name) {
		super();
		this.id = id;
		this.addresseeCode = addresseeCode;
		this.senderCode = senderCode;
		this.date = date;
		this.type = type;
		this.content = content;
		this.stutas = stutas;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddresseeCode() {
		return addresseeCode;
	}
	public void setAddresseeCode(String addresseeCode) {
		this.addresseeCode = addresseeCode;
	}
	public String getSenderCode() {
		return senderCode;
	}
	public void setSenderCode(String senderCode) {
		this.senderCode = senderCode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	public String getStutas() {
		return stutas;
	}
	public void setStutas(String stutas) {
		this.stutas = stutas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Massage [id=" + id + ", addresseeCode=" + addresseeCode + ", senderCode=" + senderCode + ", date="
				+ date + ", type=" + type + ", content=" + content + ", stutas=" + stutas + ", name=" + name + "]";
	}
	

}
