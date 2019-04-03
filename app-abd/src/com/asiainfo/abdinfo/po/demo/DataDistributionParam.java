package com.asiainfo.abdinfo.po.demo;

import java.io.Serializable;

public class DataDistributionParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2433953088665730989L;
	private String ref_date;
	private String province;
	private String city;
	private String genders;
	private String platforms;
	private String devices;
	private Integer ages;
	private String visit_uv_type;
	public DataDistributionParam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DataDistributionParam(String ref_date, String province, String city, String genders, String platforms,
			String devices, Integer ages, String visit_uv_type) {
		super();
		this.ref_date = ref_date;
		this.province = province;
		this.city = city;
		this.genders = genders;
		this.platforms = platforms;
		this.devices = devices;
		this.ages = ages;
		this.visit_uv_type = visit_uv_type;
	}
	
	@Override
	public String toString() {
		return "DataDistributionParam [ref_date=" + ref_date + ", province=" + province + ", city=" + city
				+ ", genders=" + genders + ", platforms=" + platforms + ", devices=" + devices + ", ages=" + ages
				+ ", visit_uv_type=" + visit_uv_type + "]";
	}
	
	public String getVisit_uv_type() {
		return visit_uv_type;
	}

	public void setVisit_uv_type(String visit_uv_type) {
		this.visit_uv_type = visit_uv_type;
	}

	public String getRef_date() {
		return ref_date;
	}
	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGenders() {
		return genders;
	}
	public void setGenders(String genders) {
		this.genders = genders;
	}
	public String getPlatforms() {
		return platforms;
	}
	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}
	public String getDevices() {
		return devices;
	}
	public void setDevices(String devices) {
		this.devices = devices;
	}
	public Integer getAges() {
		return ages;
	}
	public void setAges(Integer ages) {
		this.ages = ages;
	}
	
}
