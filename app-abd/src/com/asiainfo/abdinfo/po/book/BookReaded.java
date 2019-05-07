package com.asiainfo.abdinfo.po.book;

import java.io.Serializable;
import java.util.List;

import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;
import com.asiainfo.abdinfo.po.community.FlowLeaveWordChild;

public class BookReaded extends ListAllFeeling implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6253106679482241344L;
	private Integer id;
	private Integer bookId;
	private String staffCode;
	private Integer chapterId;
	private String readingTime;
	private Integer readChapterStatus;
	private String readingFell;
	private String timeDuration;
	private String createtime;
	private String readingFellNum;
	private List<FlowLeaveWordChild> leaveWordChild;
	BookReaded(Integer id, Integer bookId, String staffCode, Integer chapterId, String readingTime,
			Integer readChapterStatus, String readingFell, String timeDuration, String createtime,
			String readingFellNum, List<FlowLeaveWordChild> leaveWordChild) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.staffCode = staffCode;
		this.chapterId = chapterId;
		this.readingTime = readingTime;
		this.readChapterStatus = readChapterStatus;
		this.readingFell = readingFell;
		this.timeDuration = timeDuration;
		this.createtime = createtime;
		this.readingFellNum = readingFellNum;
		this.leaveWordChild = leaveWordChild;
	}
	BookReaded() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "BookReaded [id=" + id + ", bookId=" + bookId + ", staffCode=" + staffCode + ", chapterId=" + chapterId
				+ ", readingTime=" + readingTime + ", readChapterStatus=" + readChapterStatus + ", readingFell="
				+ readingFell + ", timeDuration=" + timeDuration + ", createtime=" + createtime + ", readingFellNum="
				+ readingFellNum + ", leaveWordChild="
				+ (leaveWordChild != null ? leaveWordChild.subList(0, Math.min(leaveWordChild.size(), maxLen)) : null)
				+ "]";
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
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public Integer getChapterId() {
		return chapterId;
	}
	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
	}
	public String getReadingTime() {
		return readingTime;
	}
	public void setReadingTime(String readingTime) {
		this.readingTime = readingTime;
	}
	public Integer getReadChapterStatus() {
		return readChapterStatus;
	}
	public void setReadChapterStatus(Integer readChapterStatus) {
		this.readChapterStatus = readChapterStatus;
	}
	public String getReadingFell() {
		return readingFell;
	}
	public void setReadingFell(String readingFell) {
		this.readingFell = readingFell;
	}
	public String getTimeDuration() {
		return timeDuration;
	}
	public void setTimeDuration(String timeDuration) {
		this.timeDuration = timeDuration;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getReadingFellNum() {
		return readingFellNum;
	}
	public void setReadingFellNum(String readingFellNum) {
		this.readingFellNum = readingFellNum;
	}
	public List<FlowLeaveWordChild> getLeaveWordChild() {
		return leaveWordChild;
	}
	public void setLeaveWordChild(List<FlowLeaveWordChild> leaveWordChild) {
		this.leaveWordChild = leaveWordChild;
	}
}
