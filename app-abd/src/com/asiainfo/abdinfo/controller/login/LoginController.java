package com.asiainfo.abdinfo.controller.login;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.abdinfo.common.ErrorCode;
import com.asiainfo.abdinfo.common.ReturnResult;
import com.asiainfo.abdinfo.po.User;
import com.asiainfo.abdinfo.service.UserService;

//7721d227abae68a13fc580988e2b8850   secret  //重要
@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	
	/**
	 * 登录验证
	 * @author jinxy
	 * @date 2018年7月9日
	 */
	@ResponseBody
	@RequestMapping(value="/Login.do")
	public String login(HttpServletRequest request,HttpServletResponse resp, HttpSession session) throws Exception{
		String userId=request.getParameter("userId");
		String pwd=request.getParameter("pwd");
		Map<String,Object> map=new HashMap<String,Object>();
	    map.put("staffCode", userId);
	    map.put("staffPwd", pwd);
		User user = null;
		if(!StringUtils.isEmpty(userId) && !StringUtils.isEmpty(pwd)){
			user = userService.getUserByIdAndName(map);
			if(user != null){
				session.setAttribute("staffCode", userId);	
				return ReturnResult.successJson(null);
			}else{
				return ReturnResult.failJson(ErrorCode.NO_AUTH);
			}
		}else{
			return ReturnResult.failJson(ErrorCode.PARAM_EMPTY);
		}
	}
	
	@ResponseBody
	@RequestMapping(value="/ToLogin.do")
	public JSONObject toLogin(HttpServletResponse response,  
			@RequestParam(value="encryptedData") String encryptedData,
			@RequestParam(value="iv") String iv,
			@RequestParam(value="code") String code) throws Exception{
		
		return WXAppletUserInfo.getSessionKeyOropenid(code);		
	}
	
	

	

	

   

}




