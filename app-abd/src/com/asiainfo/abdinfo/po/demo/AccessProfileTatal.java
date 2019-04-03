package com.asiainfo.abdinfo.po.demo;

import java.io.Serializable;
import java.util.List;

public class AccessProfileTatal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8218239858858505662L;
	private List<AccessProfile> list;

	AccessProfileTatal() {
		super();
		// TODO Auto-generated constructor stub
	}

	AccessProfileTatal(List<AccessProfile> list) {
		super();
		this.list = list;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "VisitorTrendingTatal [list=" + (list != null ? list.subList(0, Math.min(list.size(), maxLen)) : null)
				+ "]";
	}

	public List<AccessProfile> getList() {
		return list;
	}

	public void setList(List<AccessProfile> list) {
		this.list = list;
	}
	
}
