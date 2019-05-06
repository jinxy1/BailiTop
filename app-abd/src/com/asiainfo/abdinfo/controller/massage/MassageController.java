package com.asiainfo.abdinfo.controller.massage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.po.User;
import com.asiainfo.abdinfo.service.ICommunityService;
import com.asiainfo.abdinfo.service.IStutasService;
/**信息流*/
@Controller
public class MassageController{
	@Resource
	private IStutasService stutasService;
	@Resource
	private ICommunityService communityService;
	
	/**统计未读信息流个数*/
	@RequestMapping(value="massageCount.do")
	@ResponseBody
	public void findMassageCount(String user,HttpServletRequest request, HttpServletResponse response,HttpSession session){
		long start=System.currentTimeMillis();
		String staffCode=request.getParameter("staffCode");
		User users=JSON.parseObject(user,User.class);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("staffCode", staffCode);
		Integer countMassage=communityService.getunlessMsgCount(users);
		Integer countFabulous=stutasService.selectFabulousNum(map);
		List<Integer> count=new ArrayList<Integer>();
		count.add(countMassage);
		count.add(countFabulous);
		ResponseUtils.renderJson(response, JsonUtils.toJson(count));
		long end=System.currentTimeMillis();
		System.out.println("公告时间是："+(end-start));
	}
	
}
