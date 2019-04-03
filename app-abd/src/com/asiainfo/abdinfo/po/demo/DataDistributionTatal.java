package com.asiainfo.abdinfo.po.demo;

import java.io.Serializable;

//获取小程序新增或活跃用户的画像分布数据
public class DataDistributionTatal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3235877979838892402L;
	private String ref_date;
	private DataDistributionContent visit_uv_new;
	private DataDistributionContent visit_uv;
	DataDistributionTatal() {
		super();
		// TODO Auto-generated constructor stub
	}
	DataDistributionTatal(String ref_date, DataDistributionContent visit_uv_new, DataDistributionContent visit_uv) {
		super();
		this.ref_date = ref_date;
		this.visit_uv_new = visit_uv_new;
		this.visit_uv = visit_uv;
	}
	@Override
	public String toString() {
		return "DataDistributionTatal [ref_date=" + ref_date + ", visit_uv_new=" + visit_uv_new + ", visit_uv="
				+ visit_uv + "]";
	}
	public String getRef_date() {
		return ref_date;
	}
	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
	}
	public DataDistributionContent getVisit_uv_new() {
		return visit_uv_new;
	}
	public void setVisit_uv_new(DataDistributionContent visit_uv_new) {
		this.visit_uv_new = visit_uv_new;
	}
	public DataDistributionContent getVisit_uv() {
		return visit_uv;
	}
	public void setVisit_uv(DataDistributionContent visit_uv) {
		this.visit_uv = visit_uv;
	}
	
}
