package com.asiainfo.abdinfo.controller.readClock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.service.linkageHomeService;

@Controller
@RequestMapping(value="calendar")
public class CalendarController {
	
	@Autowired
	private linkageHomeService inkageHomeService;
	
	@RequestMapping(value = "calContent.do")
	public void Linkage(HttpServletRequest request, HttpServletResponse response,String staffCode,String date) {
		ResponseUtils.renderJson(response, JsonUtils.toJson(inkageHomeService.selectCalendarContent(staffCode,date)));
	}
	
	@RequestMapping(value = "judgeReadCont.do")
	public void judgeRead(HttpServletRequest request, HttpServletResponse response,String staffCode,String clockDate){
		ResponseUtils.renderJson(response, JsonUtils.toJson(inkageHomeService.judgeRead(staffCode, clockDate)));
	}

}
