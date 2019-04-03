package com.asiainfo.abdinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.Reflection;

public interface ReflectionDao {
	List<Reflection> findbydayrc(@Param("staffcode")String staffcode,@Param("date")String date);
}
