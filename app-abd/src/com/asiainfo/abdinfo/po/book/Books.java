package com.asiainfo.abdinfo.po.book;

import java.io.Serializable;

public class Books implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3732991637021923950L;
	private Integer id;
	private Integer percent=0;
	private String bookName;
	private String bookImg;
	private String bookOverview;
	private Integer bookAfter;
	private Integer bookReading;
	private Integer readedPer;
	private Integer allReadPer;
	private String bookAuthor;
	private Integer status;
	Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Books [id=" + id + ", percent=" + percent + ", bookName=" + bookName + ", bookImg=" + bookImg
				+ ", bookOverview=" + bookOverview + ", bookAfter=" + bookAfter + ", bookReading=" + bookReading
				+ ", readedPer=" + readedPer + ", allReadPer=" + allReadPer + ", bookAuthor=" + bookAuthor + ", status="
				+ status + "]";
	}

	Books(Integer id, Integer percent, String bookName, String bookImg, String bookOverview, Integer bookAfter,
			Integer bookReading, Integer readedPer, Integer allReadPer, String bookAuthor, Integer status) {
		super();
		this.id = id;
		this.percent = percent;
		this.bookName = bookName;
		this.bookImg = bookImg;
		this.bookOverview = bookOverview;
		this.bookAfter = bookAfter;
		this.bookReading = bookReading;
		this.readedPer = readedPer;
		this.allReadPer = allReadPer;
		this.bookAuthor = bookAuthor;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPercent() {
		return percent;
	}
	public void setPercent(Integer percent) {
		this.percent = percent;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookImg() {
		return bookImg;
	}
	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}
	public String getBookOverview() {
		return bookOverview;
	}
	public void setBookOverview(String bookOverview) {
		this.bookOverview = bookOverview;
	}
	public Integer getBookAfter() {
		return bookAfter;
	}
	public void setBookAfter(Integer bookAfter) {
		this.bookAfter = bookAfter;
	}
	public Integer getBookReading() {
		return bookReading;
	}
	public void setBookReading(Integer bookReading) {
		this.bookReading = bookReading;
	}
	public Integer getReadedPer() {
		return readedPer;
	}
	public void setReadedPer(Integer readedPer) {
		this.readedPer = readedPer;
	}
	public Integer getAllReadPer() {
		return allReadPer;
	}
	public void setAllReadPer(Integer allReadPer) {
		this.allReadPer = allReadPer;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
