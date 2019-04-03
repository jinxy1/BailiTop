package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class Tips implements Serializable {

	private static final long serialVersionUID = 1L;

	// a.部门,
	private String department;

	// a.姓名,
	private String staffName;

	// 人员编码
	private String staffCode;

	// 打卡日期
	private String clockDate;
	
	//创建日期
	private String creationDate;
	
	//打卡天数
	private String clockDay;
	
	//打卡书
	private String clockBook;
	
	//打卡章节
	private String clockDirectory;
	
	//读书感悟
	private String readingComprehension;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getClockDate() {
		return clockDate;
	}

	public void setClockDate(String clockDate) {
		this.clockDate = clockDate;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getClockDay() {
		return clockDay;
	}

	public void setClockDay(String clockDay) {
		this.clockDay = clockDay;
	}

	public String getClockBook() {
		return clockBook;
	}

	public void setClockBook(String clockBook) {
		this.clockBook = clockBook;
	}

	public String getClockDirectory() {
		return clockDirectory;
	}

	public void setClockDirectory(String clockDirectory) {
		this.clockDirectory = clockDirectory;
	}

	public String getReadingComprehension() {
		return readingComprehension;
	}

	public void setReadingComprehension(String readingComprehension) {
		this.readingComprehension = readingComprehension;
	}

	@Override
	public String toString() {
		return "Tips [department=" + department + ", staffName=" + staffName + ", staffCode=" + staffCode
				+ ", clockDate=" + clockDate + ", creationDate=" + creationDate + ", clockDay=" + clockDay
				+ ", clockBook=" + clockBook + ", clockDirectory=" + clockDirectory + ", readingComprehension="
				+ readingComprehension + "]";
	}
	


}
