package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class DataWX implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4493197057297490715L;
	private String access_token;
	private String expires_in;
	@Override
	public String toString() {
		return "DataWX [access_token=" + access_token + ", expires_in=" + expires_in + "]";
	}
	DataWX() {
		super();
		// TODO Auto-generated constructor stub
	}
	DataWX(String access_token, String expires_in) {
		super();
		this.access_token = access_token;
		this.expires_in = expires_in;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	
	
}
