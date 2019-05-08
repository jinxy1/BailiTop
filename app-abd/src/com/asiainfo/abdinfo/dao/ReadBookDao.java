package com.asiainfo.abdinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.reads.Readingbook;

public interface ReadBookDao {
	
	List<Readingbook> findBooked(); 
	
	/**
	 * 计算总时长
	 * @return
	 */
	String selectTotalTime(@Param(value="staffCode")String staffCode);
}
