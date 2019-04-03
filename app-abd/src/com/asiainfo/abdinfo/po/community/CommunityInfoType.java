package com.asiainfo.abdinfo.po.community;

import java.io.Serializable;

public class CommunityInfoType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -511568257339936301L;
	private Integer id;
	private String typeName;
	private String typeImg;
	private int unreadCount;
	public CommunityInfoType() {
		super();
	}
	CommunityInfoType(Integer id, String typeName, String typeImg, int unreadCount) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.typeImg = typeImg;
		this.unreadCount = unreadCount;
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
	public String getTypeImg() {
		return typeImg;
	}
	public void setTypeImg(String typeImg) {
		this.typeImg = typeImg;
	}
	@Override
	public String toString() {
		return "CommunityInfoType [id=" + id + ", typeName=" + typeName + ", typeImg=" + typeImg + ", unreadCount="
				+ unreadCount + "]";
	}
	public int getUnreadCount() {
		return unreadCount;
	}
	public void setUnreadCount(int unreadCount) {
		this.unreadCount = unreadCount;
	}
	

}
