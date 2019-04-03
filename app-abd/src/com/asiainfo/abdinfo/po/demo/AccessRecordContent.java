package com.asiainfo.abdinfo.po.demo;

public class AccessRecordContent {
	private String key;
	private Integer value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	AccessRecordContent(String key, Integer value) {
		super();
		this.key = key;
		this.value = value;
	}
	AccessRecordContent() {
		super();
		// TODO Auto-generated constructor stub
	}
}
