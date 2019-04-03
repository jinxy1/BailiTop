package com.asiainfo.abdinfo.dao;

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
public interface PlanDao {
	List<DayPlan> makePlan(@Param("staffCode") String staffCode);
	
	/**
	 * 插入数据操作
	 */
 	void insertPlanRecord(@Param(value="staffCode") String staffCode,
			@Param(value="planTime") String planTime,@Param(value="list") List<PlanRecord> list);
 	
 	/**
 	 * 反查插入的数据
 	 * @return
 	 */
 	List<PlanData> selectPlan(@Param(value="staffCode") String staffCode,@Param(value="planTime") String planTime);
 	
 	/**
 	 * 反查删除的数据
 	 * @param id
 	 */
 	void delectPlan(@Param(value="id") String id);
}









