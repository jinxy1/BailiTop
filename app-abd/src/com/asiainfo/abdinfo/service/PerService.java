package com.asiainfo.abdinfo.service;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.Personnel;


public interface PerService {
	 
  
  public List<Personnel> findAllPer();
  
  public Personnel findByCode(String usercode);
  
  public Map<String, Object> findbydaydiligence(String staffcode,String date,String bumen);
}
