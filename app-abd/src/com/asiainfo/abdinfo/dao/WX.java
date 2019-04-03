package com.asiainfo.abdinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.demo.AccessProfile;
import com.asiainfo.abdinfo.po.demo.DataDistribution;
import com.asiainfo.abdinfo.po.demo.PageAccessTatal;
import com.asiainfo.abdinfo.po.demo.VisitorTrending;

public interface WX {
	public int add1(@Param("ref_date") String ref_date,@Param("visit_uv_new") Integer visit_uv_new,@Param("visit_uv") Integer visit_uv);
	public int add2(VisitorTrending vTrending);
	public int add3(AccessProfile aProfile);
	public int add4(
			@Param("dParams") List<DataDistribution> dParam,
			@Param("ref_date") String ref_date,
			@Param("type") String type,
			@Param("visit_uv_type") String visit_uv_type);
	public int add5(PageAccessTatal pTatal);
}
