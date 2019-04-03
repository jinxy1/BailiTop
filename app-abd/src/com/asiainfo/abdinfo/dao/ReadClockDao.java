package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.DayRest;
import com.asiainfo.abdinfo.po.ReadClock;
import com.asiainfo.abdinfo.po.ReadCount;
import com.asiainfo.abdinfo.po.NewLoginBean.Integral;

public interface ReadClockDao {
	
	/**
	 * 查询信息
	 * @param map
	 * @return
	 */
	List<ReadClock> findReadIndex(Map<String,Object> map);
	
	/**
	 * 各种统计
	 * @return
	 */
	ReadCount findCount(Map<String,Object> map);
	
	/*
	 * 判断有多少人上线 
	 */
	String findCountPeople(Map<String,Object> map);
	
	/**
	 * 插入数据即更新
	 * @param map
	 */
	void updateBook(Map<String,Object> map);
	

	/**
	 * 查数据 该功能用来做日历模块
	 * @param map
	 * @return
	 */
	List<Map<String,Object>> selectCalendar(Map<String,Object> map);

	
	
	/**
	 * 查询读书心得的积分
	 * @param staffCode
	 * @param clockDate
	 * @return
	 */
	String selectIntegralRead(@Param(value="staffCode") String staffCode,@Param(value="clockDate") String clockDate);
	
	/**
	 * 绘制积分图案
	 * @return
	 */
	Integral selectIconLevel(@Param(value="staffCode") String staffCode);
	
	
	
	
	/**
	 * 根据假期判断
	 * @param yearMonth 传入年月
	 * @param month   传入月份
	 * @return
	 */
	List<DayRest> selectDayRest(@Param(value="staffCode") String yearMonth,@Param(value="yearMonth") String month,@Param(value="yearDay") String yearDay,@Param(value="status") String status);
	
	/**
	 * 判断有没有数据
	 * @param yearMonth
	 * @param month
	 * @return
	 */
	String selectJibenxinxi(@Param(value="staffCode") String yearMonth,@Param(value="yearMonth") String month);
	
	/**
	 * 查数据 该功能用来做日历模块
	 * @param map
	 * @return
	 */
	List<DayRest> selectCalendar(@Param(value="staffCode") String yearMonth,@Param(value="yearMonth") String month);
	

	
	
}








