package com.asiainfo.abdinfo.controller.loginTest;


import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.abdinfo.service.NewLoginService;
import com.asiainfo.abdinfo.utils.Login.AesCbcUtil;
import com.asiainfo.abdinfo.utils.Login.HttpRequest;

 

@Controller
public class WXLoginController {
	
	//final Base64.Encoder encoder = Base64.getEncoder();
	
	@Autowired
	private NewLoginService newLoginService;
	
	
    @RequestMapping(value = "/decodeUserInfo.do", method=RequestMethod.POST)  
    @ResponseBody  
    public Map<String,Object> decodeUserInfo(@RequestParam(value="encryptedData") String encryptedData, @RequestParam(value="iv")String iv,@RequestParam(value="code") String code) {  
    System.out.println(encryptedData+iv+code);
    	
    Map<String,Object> map = new HashMap<String,Object>();  
 
    // 登录凭证不能为空  
    if (code == null || code.length() == 0) {  
        map.put("status", 0);  
        map.put("msg", "code 不能为空");  
        return map;  
    }  
 
    // 小程序唯一标识 (在微信小程序管理后台获取)  
    String wxspAppid = "wxda05ced5b87ff9e3";  
    // 小程序的 app secret (在微信小程序管理后台获取)  
    String wxspSecret = "c6a37f44d4653bad24d0e87489774372";  
    // 授权（必填）  
    String grant_type = "authorization_code";  
 
    //////////////// 1、向微信服务器 使用登录凭证 code 获取 session_key 和 openid  
    //////////////// ////////////////  
    // 请求参数  
    String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type="  
            + grant_type;  
    // 发送请求  
    String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);  
  
    // 解析相应内容（转换成json对象）  
    JSONObject json=null;
	try {
		json = new JSONObject(sr);
		System.out.println(json);
	
	} catch (JSONException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}  
    // 获取会话密钥（session_key）  
    String session_key = null;
	try {
		session_key = json.get("session_key").toString();
		System.out.println(session_key);
	} catch (JSONException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}  
    // 用户的唯一标识（openid）  
    try {
		String openid = (String) json.get("openid");
		System.out.println(openid);
	} catch (JSONException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}  
 
    //////////////// 2、对encryptedData加密数据进行AES解密 ////////////////  
    try {  
        String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");  
        if (null != result && result.length() > 0) {  
            map.put("status", 1);  
            map.put("msg", "解密成功");  
 
            JSONObject userInfoJSON = new JSONObject(result);  
            Map<String,Object> userInfo = new HashMap<String,Object>();  
            userInfo.put("openId", userInfoJSON.get("openId"));  
            userInfo.put("nickName", "");  
            userInfo.put("gender", userInfoJSON.get("gender"));  
            userInfo.put("city", userInfoJSON.get("city"));  
            userInfo.put("province", userInfoJSON.get("province"));  
            userInfo.put("country", userInfoJSON.get("country"));  
            userInfo.put("avatarUrl", userInfoJSON.get("avatarUrl"));  
            // 解密unionId & openId;  
            if (!userInfoJSON.isNull("unionId")) {
            	userInfo.put("unionId", userInfoJSON.get("unionId"));  
			}
            map.put("userInfo", userInfo);  
            System.out.println(newLoginService.getUser(userInfo));
            System.out.println("--------------------");
            if(newLoginService.getUser(userInfo).size()==0){
        	   newLoginService.insertUser(userInfo);      	   
        	}
           else{
        	   newLoginService.updateUser(userInfo);
        	  
           }
            
        } else {  
            map.put("status", 0);  
            map.put("msg", "解密失败");  
        }  
    } catch (Exception e) {  
        e.printStackTrace();  
    }       	return map;  
	}
}
