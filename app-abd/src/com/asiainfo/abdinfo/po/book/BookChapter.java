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
	private String radioUrl;
	private String videoUrl;
	private List<Map<String,String>> contents;
	private Integer readChapterStatus;
	private String readingFell;
	public BookChapter() {
		super();
		// TODO Auto-generated constructor stub
	}
	BookChapter(Integer id, Integer bookId, String chapter, String content, String radioUrl, String videoUrl,
			List<Map<String, String>> contents, Integer readChapterStatus, String readingFell) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.chapter = chapter;
		this.content = content;
		this.radioUrl = radioUrl;
		this.videoUrl = videoUrl;
		this.contents = contents;
		this.readChapterStatus = readChapterStatus;
		this.readingFell = readingFell;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "BookChapter [id=" + id + ", bookId=" + bookId + ", chapter=" + chapter + ", content=" + content
				+ ", radioUrl=" + radioUrl + ", videoUrl=" + videoUrl + ", contents="
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
	public String getRadioUrl() {
		return radioUrl;
	}
	public void setRadioUrl(String radioUrl) {
		this.radioUrl = radioUrl;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
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
