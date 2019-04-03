package com.asiainfo.abdinfo.po.demo;

import java.io.Serializable;

//访问趋势实体类
public class VisitorTrending implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3984617255504695360L;
	private String ref_date;
	private String session_cnt;
	private String visit_pv;
	private String visit_uv;
	private String visit_uv_new;
	private String stay_time_session;
	private String visit_depth;
	VisitorTrending() {
		super();
		// TODO Auto-generated constructor stub
	}
	VisitorTrending(String ref_date, String session_cnt, String visit_pv, String visit_uv, String visit_uv_new,
			String stay_time_session, String visit_depth) {
		super();
		this.ref_date = ref_date;
		this.session_cnt = session_cnt;
		this.visit_pv = visit_pv;
		this.visit_uv = visit_uv;
		this.visit_uv_new = visit_uv_new;
		this.stay_time_session = stay_time_session;
		this.visit_depth = visit_depth;
	}
	@Override
	public String toString() {
		return "VisitorTrending [ref_date=" + ref_date + ", session_cnt=" + session_cnt + ", visit_pv=" + visit_pv
				+ ", visit_uv=" + visit_uv + ", visit_uv_new=" + visit_uv_new + ", stay_time_session="
				+ stay_time_session + ", visit_depth=" + visit_depth + "]";
	}
	public String getRef_date() {
		return ref_date;
	}
	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
	}
	public String getSession_cnt() {
		return session_cnt;
	}
	public void setSession_cnt(String session_cnt) {
		this.session_cnt = session_cnt;
	}
	public String getVisit_pv() {
		return visit_pv;
	}
	public void setVisit_pv(String visit_pv) {
		this.visit_pv = visit_pv;
	}
	public String getVisit_uv() {
		return visit_uv;
	}
	public void setVisit_uv(String visit_uv) {
		this.visit_uv = visit_uv;
	}
	public String getVisit_uv_new() {
		return visit_uv_new;
	}
	public void setVisit_uv_new(String visit_uv_new) {
		this.visit_uv_new = visit_uv_new;
	}
	public String getStay_time_session() {
		return stay_time_session;
	}
	public void setStay_time_session(String stay_time_session) {
		this.stay_time_session = stay_time_session;
	}
	public String getVisit_depth() {
		return visit_depth;
	}
	public void setVisit_depth(String visit_depth) {
		this.visit_depth = visit_depth;
	}
	
}
