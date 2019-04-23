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
	private Integer praise;
	private Integer fabulous;
	private Integer myenshrine;
	private String headPortrait;
	private String name;
	BookInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "BookInfo [id=" + id + ", bookId=" + bookId + ", bookReview=" + bookReview + ", status=" + status
				+ ", createTime=" + createTime + ", staffCode=" + staffCode + ", praise=" + praise + ", fabulous="
				+ fabulous + ", myenshrine=" + myenshrine + ", headPortrait=" + headPortrait + ", name=" + name + "]";
	}
	
	BookInfo(Integer id, Integer bookId, String bookReview, Integer status, String createTime, String staffCode,
			Integer praise, Integer fabulous, Integer myenshrine, String headPortrait, String name) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.bookReview = bookReview;
		this.status = status;
		this.createTime = createTime;
		this.staffCode = staffCode;
		this.praise = praise;
		this.fabulous = fabulous;
		this.myenshrine = myenshrine;
		this.headPortrait = headPortrait;
		this.name = name;
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
	public Integer getPraise() {
		return praise;
	}
	public void setPraise(Integer praise) {
		this.praise = praise;
	}
	public Integer getFabulous() {
		return fabulous;
	}
	public void setFabulous(Integer fabulous) {
		this.fabulous = fabulous;
	}
	public Integer getMyenshrine() {
		return myenshrine;
	}
	public void setMyenshrine(Integer myenshrine) {
		this.myenshrine = myenshrine;
	}

	public String getHeadPortrait() {
		return headPortrait;
	}

	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
