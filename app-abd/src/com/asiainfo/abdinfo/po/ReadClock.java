package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class ReadClock implements Serializable {

	private static final long serialVersionUID = 1L;

	// rp.人员编码,
	private String staffCode;
	
	// dp.姓名,
	private String staffName;
	
	// dp.岗位,
	private String staffJobs;
	
	//书的id
	private String bookID;
	
	// bb.书名,
	private String clockBook;
	
	// rp.计划读书日期,
	private String clockDate;
	
	// rd.打卡天数,
	private String clockDay;
	
	// rd.章节名,
	private String clockDirectory;
	
	// rd.内容,
	private String content;
	
	// dp.部门
	private String department;
	
	//rp.读书时间 as 
	private String ReadingTime;
	
	//rp.读书感悟 as ReadingFeeling,
	private String ReadingFeeling;
	
	//rp.读书时间 as actualReading
	private String actualReading;
	
	private String struggleName;
	
	private Integer struggleId;
	
	private int num;



	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffJobs() {
		return staffJobs;
	}

	public void setStaffJobs(String staffJobs) {
		this.staffJobs = staffJobs;
	}

	public String getClockBook() {
		return clockBook;
	}

	public void setClockBook(String clockBook) {
		this.clockBook = clockBook;
	}

	public String getClockDate() {
		return clockDate;
	}

	public void setClockDate(String clockDate) {
		this.clockDate = clockDate;
	}

	public String getClockDay() {
		return clockDay;
	}

	public void setClockDay(String clockDay) {
		this.clockDay = clockDay;
	}

	public String getClockDirectory() {
		return clockDirectory;
	}

	public void setClockDirectory(String clockDirectory) {
		this.clockDirectory = clockDirectory;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getReadingTime() {
		return ReadingTime;
	}

	public void setReadingTime(String readingTime) {
		ReadingTime = readingTime;
	}

	public String getReadingFeeling() {
		return ReadingFeeling;
	}

	public void setReadingFeeling(String readingFeeling) {
		ReadingFeeling = readingFeeling;
	}

	public String getActualReading() {
		return actualReading;
	}

	public void setActualReading(String actualReading) {
		this.actualReading = actualReading;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	
	

	public String getStruggleName() {
		return struggleName;
	}

	public void setStruggleName(String struggleName) {
		this.struggleName = struggleName;
	}

	public Integer getStruggleId() {
		return struggleId;
	}

	public void setStruggleId(Integer struggleId) {
		this.struggleId = struggleId;
	}

	@Override
	public String toString() {
		return "ReadClock [staffCode=" + staffCode + ", staffName=" + staffName + ", staffJobs=" + staffJobs
				+ ", bookID=" + bookID + ", clockBook=" + clockBook + ", clockDate=" + clockDate + ", clockDay="
				+ clockDay + ", clockDirectory=" + clockDirectory + ", content=" + content + ", department="
				+ department + ", ReadingTime=" + ReadingTime + ", ReadingFeeling=" + ReadingFeeling
				+ ", actualReading=" + actualReading + ", struggleName=" + struggleName + ", struggleId=" + struggleId
				+ ", num=" + num + "]";
	}

	
}




