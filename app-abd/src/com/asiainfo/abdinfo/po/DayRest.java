package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class DayRest implements Serializable{


	private static final long serialVersionUID = -3694739491774608049L;
	
	private String standDate;
	
//	private String note;
	
	private String readFeel;
	
	//private String week;

	public String getStandDate() {
		return standDate;
	}

	public void setStandDate(String standDate) {
		this.standDate = standDate;
	}

//	public String getNote() {
//		return note;
//	}
//
//	public void setNote(String note) {
//		this.note = note;
//	}

	public String getReadFeel() {
		return readFeel;
	}

	public void setReadFeel(String readFeel) {
		this.readFeel = readFeel;
	}

	@Override
	public String toString() {
		return "DayRest [standDate=" + standDate + ", readFeel=" + readFeel + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((readFeel == null) ? 0 : readFeel.hashCode());
		result = prime * result + ((standDate == null) ? 0 : standDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DayRest other = (DayRest) obj;
		if (readFeel == null) {
			if (other.readFeel != null)
				return false;
		} else if (!readFeel.equals(other.readFeel))
			return false;
		if (standDate == null) {
			if (other.standDate != null)
				return false;
		} else if (!standDate.equals(other.standDate))
			return false;
		return true;
	}

//	public String getWeek() {
//		return week;
//	}
//
//	public void setWeek(String week) {
//		this.week = week;
//	}

//	@Override
//	public String toString() {
//		return "DayRest [standDate=" + standDate + ", note=" + note + ", readFeel=" + readFeel + ", week=" + week + "]";
//	}
	
	
	
	

}
