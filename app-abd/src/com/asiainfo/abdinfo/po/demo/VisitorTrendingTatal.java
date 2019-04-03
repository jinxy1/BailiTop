package com.asiainfo.abdinfo.po.demo;

import java.io.Serializable;
import java.util.List;

public class VisitorTrendingTatal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8218239858858505662L;
	private List<VisitorTrending> list;

	VisitorTrendingTatal() {
		super();
		// TODO Auto-generated constructor stub
	}

	VisitorTrendingTatal(List<VisitorTrending> list) {
		super();
		this.list = list;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "VisitorTrendingTatal [list=" + (list != null ? list.subList(0, Math.min(list.size(), maxLen)) : null)
				+ "]";
	}

	public List<VisitorTrending> getList() {
		return list;
	}

	public void setList(List<VisitorTrending> list) {
		this.list = list;
	}
	
}
