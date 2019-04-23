package com.asiainfo.abdinfo.po.reads;

import java.io.Serializable;

public class Readingbook implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private String bookName;
	
	private String bookImg;
	
	private Integer  percentage;

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

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Readingbook [bookName=" + bookName + ", bookImg=" + bookImg + ", percentage=" + percentage + "]";
	}
	
	

}
