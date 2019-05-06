package com.asiainfo.abdinfo.controller.loginTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.abdinfo.common.ErrorCode;
import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.common.ReturnResult;
import com.asiainfo.abdinfo.po.User;
import com.asiainfo.abdinfo.po.NewLoginBean.NewLogin;
import com.asiainfo.abdinfo.service.NewLoginService;
import com.asiainfo.abdinfo.service.ReadClockService;
import com.asiainfo.abdinfo.service.UserService;

@Controller
@RequestMapping(value="/user")
public class WXRegController {
	
	
	@Autowired
	private NewLoginService newLoginService;
	
	@Autowired
	private ReadClockService readClockService;
	
	@Autowired
	private UserService userService;
	/**登录*/
	@ResponseBody
	@RequestMapping(value="/reg.do",method=RequestMethod.POST)
	public String regController(HttpServletRequest request, HttpServletResponse response,HttpSession session){
		String userId=request.getParameter("userId");
		String password=request.getParameter("pwd");
		String openId=request.getParameter("openId");
		Map<String,Object> map=new HashMap<String,Object>();
	    map.put("staffCode", userId);
	    map.put("staffPwd", password);
		User user = null;
		if(!StringUtils.isEmpty(userId) && !StringUtils.isEmpty(password)){
			user = userService.getUserByIdAndName(map);
			if(user != null){
				session.setAttribute("staffCode", userId);	
				newLoginService.regUser(userId,  password,  openId);
				return ReturnResult.successJson(null);
			}else{
				return ReturnResult.failJson(ErrorCode.NO_AUTH);
			}
		}else{
			return ReturnResult.failJson(ErrorCode.PARAM_EMPTY);
		}
		
		
		
     	}
	
	
	/**
	 * 
	 * 查询当天的读书内容信息
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/ClockInf.do")
	public void readClockCon( HttpServletRequest request, HttpServletResponse response) {
	 	long start=System.currentTimeMillis();
		String staffCode=request.getParameter("staffCode");
		String clockDate=request.getParameter("clockDate");
		Map<String,Object> re=readClockService.getReadIndex(staffCode,clockDate);
		ResponseUtils.renderJson(response, JsonUtils.toJson(re));	
		long end=System.currentTimeMillis();
		System.out.println("查询当天的读书内容时间是："+(end-start));
	}
	 
	/**根据openId查询用户信息*/
	@ResponseBody
	@RequestMapping(value = "/newUser.do")
	public void getNewUser( HttpServletRequest request, HttpServletResponse response) {
		String openId= request.getParameter("openId");
		List<NewLogin>  nn=newLoginService.getNewUser(openId);
		ResponseUtils.renderJson(response, JsonUtils.toJson(nn.get(0).getStaffCode()));	
	}
	 
	 
	 

}
