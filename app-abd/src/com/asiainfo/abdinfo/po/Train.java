package com.asiainfo.abdinfo.po;

import java.io.Serializable;
import java.util.List;

public class Train implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1685939072559612193L;
	private int id;
	private String knowledge_point;//知识点
	private String staffCode;//人员编码
	private String start_time;//开始时间
	private String end_time;//结束时间
	private List<Resource> resources;//资源
	private String academy;
	/*private String resource_name;//资源名称
	private String links_resources;//资源链接
*/	
	private String expected_outcome;//期望结果
	private String resultsContent;//结果内容
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(int id, String knowledge_point, String staffCode, String start_time, String end_time,
			List<Resource> resources, String academy, String expected_outcome, String resultsContent) {
		super();
		this.id = id;
		this.knowledge_point = knowledge_point;
		this.staffCode = staffCode;
		this.start_time = start_time;
		this.end_time = end_time;
		this.resources = resources;
		this.academy = academy;
		this.expected_outcome = expected_outcome;
		this.resultsContent = resultsContent;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKnowledge_point() {
		return knowledge_point;
	}
	public void setKnowledge_point(String knowledge_point) {
		this.knowledge_point = knowledge_point;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	/*public String getResource_name() {
		return resource_name;
	}
	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}
	public String getLinks_resources() {
		return links_resources;
	}
	public void setLinks_resources(String links_resources) {
		this.links_resources = links_resources;
	}*/

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}



	public String getExpected_outcome() {
		return expected_outcome;
	}



	public void setExpected_outcome(String expected_outcome) {
		this.expected_outcome = expected_outcome;
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getResultsContent() {
		return resultsContent;
	}

	public void setResultsContent(String resultsContent) {
		this.resultsContent = resultsContent;
	}

	
	
}
