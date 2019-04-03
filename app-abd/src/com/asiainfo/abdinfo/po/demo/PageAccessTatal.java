package com.asiainfo.abdinfo.po.demo;

import java.util.List;

public class PageAccessTatal {
	
	private String ref_date;
	private List<PageAccess> list;
	public PageAccessTatal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageAccessTatal(String ref_date, List<PageAccess> list) {
		super();
		this.ref_date = ref_date;
		this.list = list;
	}
	public String getRef_date() {
		return ref_date;
	}
	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
	}
	public List<PageAccess> getList() {
		return list;
	}
	public void setList(List<PageAccess> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "PageAccessTatal [ref_date=" + ref_date + ", list="
				+ (list != null ? list.subList(0, Math.min(list.size(), maxLen)) : null) + "]";
	}
	

}
