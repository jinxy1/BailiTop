package com.asiainfo.abdinfo.controller.basicInformation;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.service.AnoucemtService;
/**公告内容的控制器*/
@Controller
public class AnoucemtWeb {

	@Resource
	private AnoucemtService actService;
	@RequestMapping("findnowdaytitle.do")
	public void findnowdaytitle(HttpServletRequest request,HttpServletResponse response,String nowday){
		ResponseUtils.renderJson(response, JsonUtils.toJson(actService.nowdaytitle(nowday)));
	}
	
}
