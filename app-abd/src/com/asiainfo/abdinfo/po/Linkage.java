package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class Linkage implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer ID;

	private Integer PID;
	
	private String clockDate;
	
	private String clockBook;
	
	private String rid;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getPID() {
		return PID;
	}

	public void setPID(Integer pID) {
		PID = pID;
	}

	public String getClockDate() {
		return clockDate;
	}

	public void setClockDate(String clockDate) {
		this.clockDate = clockDate;
	}

	public String getClockBook() {
		return clockBook;
	}

	public void setClockBook(String clockBook) {
		this.clockBook = clockBook;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	@Override
	public String toString() {
		return "Linkage [ID=" + ID + ", PID=" + PID + ", clockDate=" + clockDate + ", clockBook=" + clockBook + ", rid="
				+ rid + "]";
	}
	
	
	

	
	

}
