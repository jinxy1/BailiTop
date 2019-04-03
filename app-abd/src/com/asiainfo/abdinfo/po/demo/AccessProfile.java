package com.asiainfo.abdinfo.po.demo;

import java.io.Serializable;

//访问趋势实体类
public class AccessProfile implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3984617255504695360L;
	private String ref_date;
	private String visit_total;
	private String share_pv;
	private String share_uv;
	AccessProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "AccessProfile [ref_date=" + ref_date + ", visit_total=" + visit_total + ", share_pv=" + share_pv
				+ ", share_uv=" + share_uv + "]";
	}

	AccessProfile(String ref_date, String visit_total, String share_pv, String share_uv) {
		super();
		this.ref_date = ref_date;
		this.visit_total = visit_total;
		this.share_pv = share_pv;
		this.share_uv = share_uv;
	}

	public String getRef_date() {
		return ref_date;
	}
	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
	}

	public String getVisit_total() {
		return visit_total;
	}

	public void setVisit_total(String visit_total) {
		this.visit_total = visit_total;
	}

	public String getShare_pv() {
		return share_pv;
	}

	public void setShare_pv(String share_pv) {
		this.share_pv = share_pv;
	}

	public String getShare_uv() {
		return share_uv;
	}

	public void setShare_uv(String share_uv) {
		this.share_uv = share_uv;
	}
	
	
}
