package com.asiainfo.abdinfo.service;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;

public interface IStutasService {
	/**将点赞超赞收藏信息添加到数据库*/
	public int addStutas(ListAllFeeling listAllFeeling);
	/**查询全部收藏信息*/
	public List<ListAllFeeling> selectEnshrines( String staffCode);
	/**根据id删除收藏信息*/
	public int deleteEnshrineById(Map<String, Object> map);
	/**查询当天个人超赞数量*/
	public Integer selectFabulousNum(Map<String, Object> map); 
}
