package com.asiainfo.abdinfo.po.demo;

import java.util.List;

public class AccessRecord {
	private String ref_date;
	private List<AccessRecordContent> visit_uv_new;
	private List<AccessRecordContent> visit_uv;
	public String getRef_date() {
		return ref_date;
	}
	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
	}
	public List<AccessRecordContent> getVisit_uv_new() {
		return visit_uv_new;
	}
	public void setVisit_uv_new(List<AccessRecordContent> visit_uv_new) {
		this.visit_uv_new = visit_uv_new;
	}
	public List<AccessRecordContent> getVisit_uv() {
		return visit_uv;
	}
	public void setVisit_uv(List<AccessRecordContent> visit_uv) {
		this.visit_uv = visit_uv;
	}
	AccessRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	AccessRecord(String ref_date, List<AccessRecordContent> visit_uv_new, List<AccessRecordContent> visit_uv) {
		super();
		this.ref_date = ref_date;
		this.visit_uv_new = visit_uv_new;
		this.visit_uv = visit_uv;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Demo [ref_date=" + ref_date + ", visit_uv_new="
				+ (visit_uv_new != null ? visit_uv_new.subList(0, Math.min(visit_uv_new.size(), maxLen)) : null)
				+ ", visit_uv=" + (visit_uv != null ? visit_uv.subList(0, Math.min(visit_uv.size(), maxLen)) : null)
				+ "]";
	}
}
