package com.asiainfo.abdinfo.controller.readClock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.po.PlanRecord;
import com.asiainfo.abdinfo.po.ReadClock;
import com.asiainfo.abdinfo.service.PlanDaoService;
import com.asiainfo.abdinfo.service.linkageHomeService;

/** 首页点击封面获取书单 */
@Controller
public class LinkageController {

	@Autowired
	private linkageHomeService inkageHomeService;
	
	@Autowired 
	private PlanDaoService planDaoService;
	

	@RequestMapping(value = "Linkage.do")
	public void Linkage(HttpServletRequest request, HttpServletResponse response) {
		String staffCode = request.getParameter("staffCode");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("staffCode", staffCode);
		List<ReadClock> re = inkageHomeService.getLinkage(map);
		System.out.println(re);
		ResponseUtils.renderJson(response, JsonUtils.toJson(re));
	}
	
	
	/***
	 * 日计划二级联动
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "dayPlan.do")
	public void dayPlan(HttpServletRequest request, HttpServletResponse response){
		String staffCode = request.getParameter("staffCode");	  
		ResponseUtils.renderJson(response, JsonUtils.toJson(planDaoService.makePlan(staffCode)));
	}
	
	/**
	 * 插入日计划
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "insertplan.do")
	@ResponseBody
	public void insertplan(HttpServletRequest request, HttpServletResponse response){
		String staffCode = request.getParameter("staffCode");	 
		String planTime = request.getParameter("planData");
		String planContentArray = request.getParameter("planContentArray");
		JSONArray planArray=JSONArray.parseArray(planContentArray);
		List<PlanRecord> list=new ArrayList<PlanRecord>();
		for(Object object:planArray){
			System.out.println(object);
			String str=object.toString();
			PlanRecord planRecord=(PlanRecord)JSON.parseObject(str,PlanRecord.class);
			list.add(planRecord);
		}
		try {
			planDaoService.insertPlanRecord(staffCode, planTime, list);
			ResponseUtils.renderJson(response, JsonUtils.toJson('1'));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据插入错误");
		}
	}
	
	
	/**
	 * 反查数据
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "selectPlan.do")
	public void Plan(HttpServletRequest request, HttpServletResponse response){
		String staffCode = request.getParameter("staffCode");	
		String planTime = request.getParameter("planData");
		ResponseUtils.renderJson(response, JsonUtils.toJson(planDaoService.selectPlan(staffCode, planTime)));
	}
	
	
	/**
	 * 删除反查数据
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "delectPlan.do")
	public void delectPlan(HttpServletRequest request, HttpServletResponse response){
		String id = request.getParameter("id");	
		planDaoService.delectPlan(id);
	}
	
	
	



	

	
	
}



