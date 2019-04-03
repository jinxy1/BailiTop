package com.asiainfo.abdinfo.po.community;

import java.io.Serializable;

public class CommunityPublisherInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9061540320407701311L;
	private Integer id;
	private Integer infoId;
	private String infoTypeName;
	private String infoTypeContent;
	public CommunityPublisherInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommunityPublisherInfo(Integer id, Integer infoId, String infoTypeName, String infoTypeContent) {
		super();
		this.id = id;
		this.infoId = infoId;
		this.infoTypeName = infoTypeName;
		this.infoTypeContent = infoTypeContent;
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
	public String getInfoTypeName() {
		return infoTypeName;
	}
	public void setInfoTypeName(String infoTypeName) {
		this.infoTypeName = infoTypeName;
	}
	public String getInfoTypeContent() {
		return infoTypeContent;
	}
	public void setInfoTypeContent(String infoTypeContent) {
		this.infoTypeContent = infoTypeContent;
	}
	@Override
	public String toString() {
		return "CommunityPublisherInfo [id=" + id + ", infoId=" + infoId + ", infoTypeName=" + infoTypeName
				+ ", infoTypeContent=" + infoTypeContent + "]";
	}
}
