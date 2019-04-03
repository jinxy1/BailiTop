package com.asiainfo.abdinfo.po.demo;

import java.io.Serializable;
import java.util.List;

public class DataDistributionContent implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3369095791711897824L;
	private List<DataDistribution> province;
	private List<DataDistribution> city;
	private List<DataDistribution> genders;
	private List<DataDistribution> platforms;
	private List<DataDistribution> devices;
	private List<DataDistribution> ages;
	DataDistributionContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	DataDistributionContent(List<DataDistribution> province, List<DataDistribution> city, List<DataDistribution> genders,
			List<DataDistribution> platforms, List<DataDistribution> devices, List<DataDistribution> ages) {
		super();
		this.province = province;
		this.city = city;
		this.genders = genders;
		this.platforms = platforms;
		this.devices = devices;
		this.ages = ages;
	}
	@Override
	public String toString() {
		return "DataDistributionContent [province=" + province + ", city=" + city + ", genders=" + genders
				+ ", platforms=" + platforms + ", devices=" + devices + ", ages=" + ages + "]";
	}
	public List<DataDistribution> getProvince() {
		return province;
	}
	public void setProvince(List<DataDistribution> province) {
		this.province = province;
	}
	public List<DataDistribution> getCity() {
		return city;
	}
	public void setCity(List<DataDistribution> city) {
		this.city = city;
	}
	public List<DataDistribution> getGenders() {
		return genders;
	}
	public void setGenders(List<DataDistribution> genders) {
		this.genders = genders;
	}
	public List<DataDistribution> getPlatforms() {
		return platforms;
	}
	public void setPlatforms(List<DataDistribution> platforms) {
		this.platforms = platforms;
	}
	public List<DataDistribution> getDevices() {
		return devices;
	}
	public void setDevices(List<DataDistribution> devices) {
		this.devices = devices;
	}
	public List<DataDistribution> getAges() {
		return ages;
	}
	public void setAges(List<DataDistribution> ages) {
		this.ages = ages;
	}
	
}
