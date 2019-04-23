package com.asiainfo.abdinfo.po.book;

import java.io.Serializable;

public class BookChapter implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer bookId;
	private String chapter;
	private String content;
	private String radio_url;
	private String video_url;
	private Integer readChapterStatus;
	BookChapter() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookChapter [id=" + id + ", bookId=" + bookId + ", chapter=" + chapter + ", content=" + content
				+ ", radio_url=" + radio_url + ", video_url=" + video_url + ", readChapterStatus=" + readChapterStatus
				+ "]";
	}
	BookChapter(Integer id, Integer bookId, String chapter, String content, String radio_url, String video_url,
			Integer readChapterStatus) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.chapter = chapter;
		this.content = content;
		this.radio_url = radio_url;
		this.video_url = video_url;
		this.readChapterStatus = readChapterStatus;
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
	public String getChapter() {
		return chapter;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Integer getReadChapterStatus() {
		return readChapterStatus;
	}

	public void setReadChapterStatus(Integer readChapterStatus) {
		this.readChapterStatus = readChapterStatus;
	}
	public String getRadio_url() {
		return radio_url;
	}
	public void setRadio_url(String radio_url) {
		this.radio_url = radio_url;
	}
	public String getVideo_url() {
		return video_url;
	}
	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
	
}
