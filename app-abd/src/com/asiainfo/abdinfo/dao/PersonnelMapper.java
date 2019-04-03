package com.asiainfo.abdinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.Personnel;
import com.asiainfo.abdinfo.po.NewLoginBean.NewLogin;

public interface PersonnelMapper {
	
	
	public List<Personnel> findAllPer();
	
	public Personnel findByCode(@Param("usercode") String usercode);
	
	public List<Personnel> findBybm(@Param("bumen") String bumen);
	
	public List<NewLogin> findbycode(@Param("staffcode")String staffcode);
	
	public List<Personnel> findBysyb(@Param("bumen")String bumen);
	
}
