package com.asiainfo.abdinfo.po.community;

import java.io.Serializable;
import java.util.List;

import com.asiainfo.abdinfo.po.Personnel;

public class CommunityInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5877355756811325458L;
	private Integer id;
	private String typeName;
	private String infoTitle;
	private String infoContent;
	private String infoCurrentTime;
	private String infoSendStaffCode;
	private Personnel personnel;
	private List<String> communityImgInfo;
	private List<CommunityPublisherInfo> publisherInfo;
	private CommunityInfoRead communityInfoRead;
	private CommunityAcceptInfo acceptInfo;
	private String typeImg;
	public CommunityInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		final int maxLen = 10;
		return "CommunityInfo [id=" + id + ", typeName=" + typeName + ", infoTitle=" + infoTitle + ", infoContent="
				+ infoContent + ", infoCurrentTime=" + infoCurrentTime + ", infoSendStaffCode=" + infoSendStaffCode
				+ ", personnel=" + personnel + ", communityImgInfo="
				+ (communityImgInfo != null ? communityImgInfo.subList(0, Math.min(communityImgInfo.size(), maxLen))
						: null)
				+ ", publisherInfo="
				+ (publisherInfo != null ? publisherInfo.subList(0, Math.min(publisherInfo.size(), maxLen)) : null)
				+ ", communityInfoRead=" + communityInfoRead + ", acceptInfo=" + acceptInfo + ", typeImg=" + typeImg
				+ "]";
	}

	public CommunityInfo(Integer id, String typeName, String infoTitle, String infoContent, String infoCurrentTime,
			String infoSendStaffCode, Personnel personnel, List<String> communityImgInfo,
			List<CommunityPublisherInfo> publisherInfo, CommunityInfoRead communityInfoRead,
			CommunityAcceptInfo acceptInfo, String typeImg) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.infoTitle = infoTitle;
		this.infoContent = infoContent;
		this.infoCurrentTime = infoCurrentTime;
		this.infoSendStaffCode = infoSendStaffCode;
		this.personnel = personnel;
		this.communityImgInfo = communityImgInfo;
		this.publisherInfo = publisherInfo;
		this.communityInfoRead = communityInfoRead;
		this.acceptInfo = acceptInfo;
		this.typeImg = typeImg;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getInfoTitle() {
		return infoTitle;
	}
	public void setInfoTitle(String infoTitle) {
		this.infoTitle = infoTitle;
	}
	public String getInfoContent() {
		return infoContent;
	}
	public void setInfoContent(String infoContent) {
		this.infoContent = infoContent;
	}
	public String getInfoCurrentTime() {
		return infoCurrentTime;
	}
	public void setInfoCurrentTime(String infoCurrentTime) {
		this.infoCurrentTime = infoCurrentTime;
	}
	public String getInfoSendStaffCode() {
		return infoSendStaffCode;
	}
	public void setInfoSendStaffCode(String infoSendStaffCode) {
		this.infoSendStaffCode = infoSendStaffCode;
	}

	public Personnel getPersonnel() {
		return personnel;
	}

	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}
	public List<String> getCommunityImgInfo() {
		return communityImgInfo;
	}
	public void setCommunityImgInfo(List<String> communityImgInfo) {
		this.communityImgInfo = communityImgInfo;
	}

	public CommunityInfoRead getCommunityInfoRead() {
		return communityInfoRead;
	}

	public void setCommunityInfoRead(CommunityInfoRead communityInfoRead) {
		this.communityInfoRead = communityInfoRead;
	}
	public CommunityAcceptInfo getAcceptInfo() {
		return acceptInfo;
	}
	public void setAcceptInfo(CommunityAcceptInfo acceptInfo) {
		this.acceptInfo = acceptInfo;
	}
	public List<CommunityPublisherInfo> getPublisherInfo() {
		return publisherInfo;
	}
	public void setPublisherInfo(List<CommunityPublisherInfo> publisherInfo) {
		this.publisherInfo = publisherInfo;
	}

	public String getTypeImg() {
		return typeImg;
	}

	public void setTypeImg(String typeImg) {
		this.typeImg = typeImg;
	}
	

}
