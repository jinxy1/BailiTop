package com.asiainfo.abdinfo.po.book;

import java.io.Serializable;

public class BookInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer bookId;
	private String bookReview;
	private Integer status;
	private String createTime;
	private String staffCode;
	BookInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BookInfo [id=" + id + ", bookId=" + bookId + ", bookReview=" + bookReview + ", status=" + status
				+ ", createTime=" + createTime + ", staffCode=" + staffCode + "]";
	}

	BookInfo(Integer id, Integer bookId, String bookReview, Integer status, String createTime, String staffCode) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.bookReview = bookReview;
		this.status = status;
		this.createTime = createTime;
		this.staffCode = staffCode;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookReview() {
		return bookReview;
	}
	public void setBookReview(String bookReview) {
		this.bookReview = bookReview;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	
}
