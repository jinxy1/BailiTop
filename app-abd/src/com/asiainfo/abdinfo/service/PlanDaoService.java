package com.asiainfo.abdinfo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.DayPlan;
import com.asiainfo.abdinfo.po.PlanData;
import com.asiainfo.abdinfo.po.PlanRecord;

/**
 * 日计划
 * @author jxy
 *
 */
public interface PlanDaoService {
	
	List<DayPlan> makePlan(@Param("staffCode") String staffCode);
	
	void insertPlanRecord( String staffCode,String planTime, List<PlanRecord> list);
	
	/**
	 * 反查插入的计划
	 * @param staffCode
	 * @param planTime
	 * @return
	 */
	List<PlanData> selectPlan(@Param(value="staffCode") String staffCode,@Param(value="planTime") String planTime);
	
	
	/**
 	 * 反查删除的数据
 	 * @param id
 	 */
	void delectPlan(String id);
}
