package com.asiainfo.abdinfo.dao;

import java.util.List;

import com.asiainfo.abdinfo.po.reads.Readingbook;

public interface ReadBookDao {
	List<Readingbook> findBooked(); 
}
