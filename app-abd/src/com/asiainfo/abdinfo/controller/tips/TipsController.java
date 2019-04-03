package com.asiainfo.abdinfo.controller.tips;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.po.User;
import com.asiainfo.abdinfo.service.ITipsService;
@Controller
public class TipsController {
	
	@Resource
	private ITipsService tipsService;
	/**添加工作总结、感想、感恩、反省读书感悟等内容*/
	@RequestMapping(value="/addtips.do")
	@ResponseBody
	public int addTips( HttpServletRequest request,HttpServletResponse response) throws ParseException{
		String department=request.getParameter("department");//部门
		String staffCode=request.getParameter("staffCode");//人员编码
		String tips=request.getParameter("tips");//今日感想等信息
		String menus=request.getParameter("menus");//感恩人的信息
		String time=request.getParameter("date");
		String customcontent=request.getParameter("customcontent");//自主填写内容
		String workList=request.getParameter("workList");//总结内容
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("time",time);
		map.put("date",time);
		map.put("tips", tips);
		map.put("department", department);
		map.put("staffCode", staffCode);
		map.put("menus", menus);
		map.put("customcontent", customcontent);
		map.put("workList", workList);
		tipsService.addTipsDailyfeeling(map);
		tipsService.addCustom_reflection(map);
		tipsService.addOwn(map);
		return 0;
	}
	
	/**添加工作总结*/
	@RequestMapping(value="/addWork.do")
	@ResponseBody
	public int addWork( HttpServletRequest request,HttpServletResponse response){
		String department=request.getParameter("department");//部门
		String staffCode=request.getParameter("staffCode");//人员编码
		String time=request.getParameter("date");//日期
		String codeStr=request.getParameter("plan");//判断是否添加计划
		String workList=request.getParameter("workList");//总结内容
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("date",time);
		map.put("department", department);
		map.put("staffCode", staffCode);
		map.put("workList", workList);
		map.put("codeStr", codeStr==null?"":codeStr);
		int code=tipsService.addWorkSummary(map);
		return code;
	}
	/**查询所有人的姓名信息用于模糊查询*/
	@RequestMapping(value="/show.do")
	@ResponseBody
	public void show(HttpServletRequest request,HttpServletResponse response){
		String staffCode=(String)request.getParameter("staffCode");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("staffCode", staffCode);
		List<User> b=tipsService.findTips(map);
		ResponseUtils.renderJson(response, JsonUtils.toJson(b));
		
	}
	
	/**删除感恩人信息*/
	@RequestMapping(value="/delete.do")
	@ResponseBody
	public void delete(HttpServletRequest request,HttpServletResponse response){
		String idstr=request.getParameter("id");
		
		Integer id= Integer.parseInt(idstr.equals("undefined")?"-1":idstr);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id",id);
		tipsService.deleteTipsOwes_content(map);
		
	}
	/**根据id删除工作总计*/
	@RequestMapping(value="/deleteWorkById.do")
	@ResponseBody
	public void deleteWork(HttpServletRequest request,HttpServletResponse response){
		String idstr=request.getParameter("id");
		Integer id= Integer.parseInt(idstr);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id",id);
		tipsService.deleteWork(map);
	}
	
	/**根据id更新工作总计*/
	@RequestMapping(value="/updateWorkById.do")
	@ResponseBody
	public void updateWork(HttpServletRequest request,HttpServletResponse response){
		String workList=request.getParameter("editWork");//总结内容
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("editWork",workList);
		tipsService.updateWork(map);
		
	}
	
	/**根据id更新工作总计*/
	@RequestMapping(value="/updateWorkStutas.do")
	@ResponseBody
	public void updateWorkStutas(HttpServletRequest request,HttpServletResponse response){
		String idstr=request.getParameter("id");
		String staffCode=request.getParameter("staffCode");
		String date=request.getParameter("date");
		String codestr=request.getParameter("code");
		Integer code= Integer.parseInt(codestr);
		Integer id= Integer.parseInt(idstr);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id",id);
		map.put("staffCode",staffCode);
		map.put("date",date);
		map.put("code",code);
		tipsService.updateWorkStutas(map);
	}
}







