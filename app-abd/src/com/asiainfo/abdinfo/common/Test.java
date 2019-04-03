package com.asiainfo.abdinfo.common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.asiainfo.abdinfo.po.Community;
import com.asiainfo.abdinfo.service.impl.CommunityServiceImple;

public class Test {
	

	
	public static void main(String[] args) {

		Html thml=new Html();
		String url="http://www.people.com.cn/";
		String urlName=url.substring(url.indexOf(".")+1, url.indexOf(".",url.indexOf(".")+1));
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		String timeName=sdf.format(new Date());
		String name=urlName+timeName;
        Set<String> urls=thml.getUrls(name, url, "a[href]");
        System.out.println(urls);

        for(String s:urls){
        	String str=s.substring(33, 42).replaceAll("/", "-");
        	StringBuilder sb=new StringBuilder(str);
        	str=sb.insert(7, "-").toString();
        	String contentName=s.substring(s.lastIndexOf("-")-1,s.lastIndexOf("."));
//        	Community co= thml.getContent(contentName, s, "div");
//        	System.out.println(co);
        }
 
        
	}
}





