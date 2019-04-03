package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Integer bookID;
	
	private String clockBook;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClockBook() {
		return clockBook;
	}

	public void setClockBook(String clockBook) {
		this.clockBook = clockBook;
	}

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookID=" + bookID + ", clockBook=" + clockBook + "]";
	}

	

	
	
	

}
