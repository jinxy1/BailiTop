package com.asiainfo.abdinfo.controller.tips;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.po.PageBean;
import com.asiainfo.abdinfo.po.SixDiligence;
import com.asiainfo.abdinfo.service.ISixDiligenceService;
import com.asiainfo.abdinfo.utils.mybatis.paginator.domain.PageBounds;

@Controller
public class SixDiligenceController {
	
	@Resource 
	private ISixDiligenceService sixDiligenceService;
	/**查询个人当天工作总结、感想、善行、反省、感恩其他*/
	@RequestMapping(value="/sixDiligence.do")
	public void findSixDiligence(HttpServletRequest request,HttpServletResponse response) throws ParseException{
		
		String staffCode=request.getParameter("staffCode");
		Map<String, Object> map=new HashMap<String,Object>();
		String stutas=request.getParameter("stutas");
		Date day=new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		String clockDate=df.format(day);
		map.put("clockDate", clockDate);
		map.put("staffCode", staffCode);
		if (stutas==null) {
			String date=request.getParameter("date");
			map.put("date", date);
		}
		Map<String, Object> data=new HashMap<String,Object>();
		data=sixDiligenceService.findSixDiligence(map);
		data.put("Customcontent", sixDiligenceService.findCustomcontent(map));
		ResponseUtils.renderJson(response, JsonUtils.toJson(data));
	}
	
	/**查询我的页面查找读书感悟*/
	@RequestMapping(value="/readingFeeling.do")
	public void findReadingFeeling(HttpServletRequest request,HttpServletResponse response) throws ParseException{
		
		String staffCode=request.getParameter("staffCode");
		String pageStr=request.getParameter("page");
		int page=Integer.parseInt(pageStr);
		int limit=Integer.valueOf(request.getParameter("limit"));
		Map<String, Object> map=new HashMap<String,Object>();
		Date day=new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		String clockDate=df.format(day);
		map.put("staffCode", staffCode);
		map.put("clockDate", clockDate);
		map.put("page", page);
		PageBounds pb = new PageBounds(page,limit);
		PageBean<SixDiligence> list=sixDiligenceService.findReadingFeeling(map,pb);
		ResponseUtils.renderJson(response, JsonUtils.toJson(list));
	}
	/**在我的查找工作总结，日感想，善行，感恩，反省的内容*/
	@RequestMapping(value="/works.do")
	public void findWorks(HttpServletRequest request,HttpServletResponse response) throws ParseException{
		
		String staffCode=request.getParameter("staffCode");
		String pageStr=request.getParameter("page");
		int page=Integer.parseInt(pageStr);
		int limit=Integer.valueOf(request.getParameter("limit"));
		Map<String, Object> map=new HashMap<String,Object>();
		Date day=new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		String clockDate=df.format(day);
		map.put("staffCode", staffCode);
		map.put("clockDate", clockDate);
		map.put("page", page);
		PageBounds pb = new PageBounds(page,limit);
		PageBean<SixDiligence> list=sixDiligenceService.findTips(map, pb);
		ResponseUtils.renderJson(response, JsonUtils.toJson(list));
	}
	/**查询部门或者事业部的日总结、感想等内容*/
	@RequestMapping("/findbydaydep.do")
	public void findbydaydep(HttpServletRequest request,HttpServletResponse response,String usercode,String nowday,String bumen){
		Map<String, Object> perlist=sixDiligenceService.findbydaydiligence(usercode, nowday,bumen);
		ResponseUtils.renderJson(response, JsonUtils.toJson(perlist));
	}
}
