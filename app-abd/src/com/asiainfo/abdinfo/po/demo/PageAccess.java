package com.asiainfo.abdinfo.po.demo;

import java.io.Serializable;

public class PageAccess implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2079411031349778404L;
	private String page_path;
	private String page_visit_pv;
	private String page_visit_uv;
	private String page_staytime_pv;
	private String entrypage_pv;
	private String exitpage_pv;
	private String page_share_pv;
	private String page_share_uv;
	public PageAccess() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageAccess(String page_path, String page_visit_pv, String page_visit_uv, String page_staytime_pv,
			String entrypage_pv, String exitpage_pv, String page_share_pv, String page_share_uv) {
		super();
		this.page_path = page_path;
		this.page_visit_pv = page_visit_pv;
		this.page_visit_uv = page_visit_uv;
		this.page_staytime_pv = page_staytime_pv;
		this.entrypage_pv = entrypage_pv;
		this.exitpage_pv = exitpage_pv;
		this.page_share_pv = page_share_pv;
		this.page_share_uv = page_share_uv;
	}
	@Override
	public String toString() {
		return "PageAccess [page_path=" + page_path + ", page_visit_pv=" + page_visit_pv + ", page_visit_uv="
				+ page_visit_uv + ", page_staytime_pv=" + page_staytime_pv + ", entrypage_pv=" + entrypage_pv
				+ ", exitpage_pv=" + exitpage_pv + ", page_share_pv=" + page_share_pv + ", page_share_uv="
				+ page_share_uv + "]";
	}
	public String getPage_path() {
		return page_path;
	}
	public void setPage_path(String page_path) {
		this.page_path = page_path;
	}
	public String getPage_visit_pv() {
		return page_visit_pv;
	}
	public void setPage_visit_pv(String page_visit_pv) {
		this.page_visit_pv = page_visit_pv;
	}
	public String getPage_visit_uv() {
		return page_visit_uv;
	}
	public void setPage_visit_uv(String page_visit_uv) {
		this.page_visit_uv = page_visit_uv;
	}
	public String getPage_staytime_pv() {
		return page_staytime_pv;
	}
	public void setPage_staytime_pv(String page_staytime_pv) {
		this.page_staytime_pv = page_staytime_pv;
	}
	public String getEntrypage_pv() {
		return entrypage_pv;
	}
	public void setEntrypage_pv(String entrypage_pv) {
		this.entrypage_pv = entrypage_pv;
	}
	public String getExitpage_pv() {
		return exitpage_pv;
	}
	public void setExitpage_pv(String exitpage_pv) {
		this.exitpage_pv = exitpage_pv;
	}
	public String getPage_share_pv() {
		return page_share_pv;
	}
	public void setPage_share_pv(String page_share_pv) {
		this.page_share_pv = page_share_pv;
	}
	public String getPage_share_uv() {
		return page_share_uv;
	}
	public void setPage_share_uv(String page_share_uv) {
		this.page_share_uv = page_share_uv;
	}
	
	
}
