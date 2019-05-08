package com.asiainfo.abdinfo.controller.loginTest;


import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.abdinfo.utils.Login.HttpRequest;

@Controller
public class WXQYController {
	
	
	public void decodeQYUserInfo() {
		//step1 获取access_token
		//企业ID
		String wxQYcorpid="ww1dc17f7e79437d0d";
		//应用的凭证密钥
		String wxQYcorpsecret="3OAjtDypA3FqL-6wDz9CY_tWipVXpfmqfDMFHfD2rEk";
		
		//https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRECT

		//https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=wx020f56c2a048cd2a&corpsecret=vilT_1Heb2l6brubKiwGFf9oxOqkAhNpbCKSOyxmoEo
		 // 请求参数  
	    String params = "corpid=" + wxQYcorpid + "&corpsecret=" + wxQYcorpsecret;  
	    // 发送请求  
	    String sr = HttpRequest.sendGet("https://qyapi.weixin.qq.com/cgi-bin/gettoken", params);  
	    
	    System.out.println(sr);
	    JSONObject json=null;
	    System.out.println(json);
//		try {
//			json = new JSONObject(sr);
//		} catch (Exception e1) {
//			e1.printStackTrace();
//		} 
		
		
		
		

	}

}



