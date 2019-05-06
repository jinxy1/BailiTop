package com.asiainfo.abdinfo.po.book;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
	private List<Map<String,String>> contents;
	private Integer readChapterStatus;
	private String readingFell;
	public BookChapter() {
		super();
		// TODO Auto-generated constructor stub
	}
	BookChapter(Integer id, Integer bookId, String chapter, String content, String radio_url, String video_url,
			List<Map<String, String>> contents, Integer readChapterStatus, String readingFell) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.chapter = chapter;
		this.content = content;
		this.radio_url = radio_url;
		this.video_url = video_url;
		this.contents = contents;
		this.readChapterStatus = readChapterStatus;
		this.readingFell = readingFell;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "BookChapter [id=" + id + ", bookId=" + bookId + ", chapter=" + chapter + ", content=" + content
				+ ", radio_url=" + radio_url + ", video_url=" + video_url + ", contents="
				+ (contents != null ? contents.subList(0, Math.min(contents.size(), maxLen)) : null)
				+ ", readChapterStatus=" + readChapterStatus + ", readingFell=" + readingFell + "]";
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
	public List<Map<String,String>> getContents() {
		return contents;
	}
	public void setContents(List<Map<String,String>> contents) {
		this.contents = contents;
	}
	public String getReadingFell() {
		return readingFell;
	}
	public void setReadingFell(String readingFell) {
		this.readingFell = readingFell;
	}
	
}
