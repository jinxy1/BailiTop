package com.asiainfo.abdinfo.po.NewLoginBean;

import java.io.Serializable;

public class NewLogin implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String openId;
	
	//员工编码
	private String staffCode;
	
	
	//微信名
	private String nickName;

	//性别
	private String gender;
	
	//城市
	private String city;
	
	//省份
	private String province;
	
	//国家
	private String country;
	
	//头像
	private String avatarUrl;
	
	//密码
	private String pwd;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "NewLogin [openId=" + openId + ", staffCode=" + staffCode + ", nickName=" + nickName + ", gender="
				+ gender + ", city=" + city + ", province=" + province + ", country=" + country + ", avatarUrl="
				+ avatarUrl + ", pwd=" + pwd + "]";
	}
	
	
	

	

	


	
	
	

}
