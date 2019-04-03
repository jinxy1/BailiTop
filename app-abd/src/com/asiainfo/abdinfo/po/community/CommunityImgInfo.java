package com.asiainfo.abdinfo.po.community;

import java.io.Serializable;

public class CommunityImgInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6831922868898281677L;
	private Integer id;
	private Integer infoId;
	private String infoImg;
	public CommunityImgInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommunityImgInfo(Integer id, Integer infoId, String infoImg) {
		super();
		this.id = id;
		this.infoId = infoId;
		this.infoImg = infoImg;
	}
	@Override
	public String toString() {
		return "CommunityImgInfo [id=" + id + ", infoId=" + infoId + ", infoImg=" + infoImg + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getInfoId() {
		return infoId;
	}
	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}
	public String getInfoImg() {
		return infoImg;
	}
	public void setInfoImg(String infoImg) {
		this.infoImg = infoImg;
	}
	
}
