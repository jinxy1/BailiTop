package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;

public interface IStutasDao {
     /**
      * 进晓宇	
      */

	//更新收藏信息
	public int addEnshrine( ListAllFeeling listAllFeeling);
	//添加点赞信息
	public int addPraise( ListAllFeeling listAllFeeling);
	//查询点赞信息
	public List<Integer>selectPraise( ListAllFeeling listAllFeeling);
	//删除点赞信息
	public int deletePraise( ListAllFeeling listAllFeeling);
	//添加超赞信息
	public int addFabulous( ListAllFeeling listAllFeeling);
	//查询超赞信息
	public List<Integer> selectFabulous( ListAllFeeling listAllFeeling);
	//查询个人当天超赞数量
	public Integer selectFabulousNum(Map<String, Object> map);
	//删除超赞信息
	public int deleteFabulous( ListAllFeeling listAllFeeling);
	//查询收藏信息
	public List<Integer> selectEnshrine( ListAllFeeling listAllFeeling);
	//删除收藏信息
	public int deleteEnshrine( ListAllFeeling listAllFeeling);
	//根据id删除收藏信息
	public int deleteEnshrineById(Map<String, Object> map);
	//查询全部收藏信息
	public List<ListAllFeeling> selectEnshrines( String staffCode);
	

	//插入点赞的信息
	int insertLike(ListAllFeeling listAllFeeling);
	
	//点赞的从库中插入数据
	void insertLikeAccept(ListAllFeeling listAllFeeling);

	//将超赞信息加入信息流
	public int insertFabulousInfo(ListAllFeeling listAllFeeling);
	public int insertFabulousInfoAccpet(ListAllFeeling listAllFeeling);
	//将收藏信息加入信息流
	public int insertEnshrineInfo(ListAllFeeling listAllFeeling);
	public int insertEnshrineInfoAccpet(ListAllFeeling listAllFeeling);
	public int existInfo(
			@Param("staffCode") String staffCode,
			@Param("infoContent") String infoContent,
			@Param("infoTitle") String infoTitle
	);
	public Integer existPraise(@Param("staffCode") String staffCode,@Param("id") Integer id);
	public Integer existFabulous(@Param("staffCode") String staffCode,@Param("id") Integer id);
	public Integer existEnshrine(@Param("staffCode") String staffCode,@Param("id") Integer id);

	
}


