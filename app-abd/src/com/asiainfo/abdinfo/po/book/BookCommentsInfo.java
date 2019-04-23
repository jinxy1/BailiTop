package com.asiainfo.abdinfo.po.book;

import java.io.Serializable;

public class BookCommentsInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6458297786832768716L;
	private Integer id;
	private String sendStaffCode;
	private String type;
	private String content;
	private String createtTime;
	private String acceptStaffCode;
	private Integer bookId;
	public BookCommentsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookCommentsInfo(Integer id, String sendStaffCode, String type, String content, String createtTime, String acceptStaffCode,
			Integer bookId) {
		super();
		this.id = id;
		this.sendStaffCode = sendStaffCode;
		this.type = type;
		this.content = content;
		this.createtTime = createtTime;
		this.acceptStaffCode = acceptStaffCode;
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Comments [id=" + id + ", sendStaffCode=" + sendStaffCode + ", type=" + type + ", content=" + content
				+ ", createtTime=" + createtTime + ", acceptStaffCode=" + acceptStaffCode + ", bookId=" + bookId
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSendStaffCode() {
		return sendStaffCode;
	}
	public void setSendStaffCode(String sendStaffCode) {
		this.sendStaffCode = sendStaffCode;
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
	public String getCreatetTime() {
		return createtTime;
	}
	public void setCreatetTime(String createtTime) {
		this.createtTime = createtTime;
	}
	public String getAcceptStaffCode() {
		return acceptStaffCode;
	}
	public void setAcceptStaffCode(String acceptStaffCode) {
		this.acceptStaffCode = acceptStaffCode;
	}
	public Integer getChapterId() {
		return bookId;
	}
	public void setChapterId(Integer bookId) {
		this.bookId = bookId;
	}
	
}
