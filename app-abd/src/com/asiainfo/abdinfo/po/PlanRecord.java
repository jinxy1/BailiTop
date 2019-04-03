package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class PlanRecord implements Serializable{


	private static final long serialVersionUID = 1L;
	
	//type,
	private String type;
	
	//projectName,
	private String projectName;
	
	//timeLong,
	private String timeLong;
	
	//planContent
	private String planContent;

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
		return "PlanRecord [type=" + type + ", projectName=" + projectName + ", timeLong=" + timeLong + ", planContent="
				+ planContent + "]";
	}
	
	
}





