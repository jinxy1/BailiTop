package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class PlanData implements Serializable{

	private static final long serialVersionUID = -3354670335994135575L;
	
	//ID,
	private Integer ID;
	//type,
	private String type;
	//projectName,
	private String projectName;
	//timeLong,
	private String timeLong;
	//planContent 
	private String planContent;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTimeLong() {
		return timeLong;
	}
	public void setTimeLong(String timeLong) {
		this.timeLong = timeLong;
	}
	public String getPlanContent() {
		return planContent;
	}
	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}
	@Override
	public String toString() {
		return "PlanData [ID=" + ID + ", type=" + type + ", projectName=" + projectName + ", timeLong=" + timeLong
				+ ", planContent=" + planContent + "]";
	}
	
	

}
