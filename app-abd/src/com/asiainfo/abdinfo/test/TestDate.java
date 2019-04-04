package com.asiainfo.abdinfo.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.abdinfo.common.Html;
import com.asiainfo.abdinfo.po.Community;
import com.asiainfo.abdinfo.service.impl.CommunityServiceImple;

public class TestDate {

	@Test
	public void test() {
		TestDate t=new TestDate();
		CommunityServiceImple mlcvp;
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-mvc.xml", "conf/spring-mybatis.xml");
		mlcvp = ac.getBean("communityServiceImple", CommunityServiceImple.class);

		Html thml = new Html();
		String url = "http://www.people.com.cn/";
		String urlName = url.substring(url.indexOf(".") + 1, url.indexOf(".", url.indexOf(".") + 1));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String timeName = sdf.format(new Date());
		String name = urlName + timeName;
		Set<String> urls = thml.getUrls(name, url, "a[href]"); // 全部的url
		
		System.out.println(urls);
		for(String s:urls){
			System.out.println(s);
		}
	
	}
	
	@Test
	public void test1() {
		String url="http://industry.people.com.cn/n1/2019/0404/c413883-31013059.html";
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MMdd");//设置日期格式
		String patt = ".*"+df.format(new Date())+"*.";
		Boolean isMatch = Pattern.matches(patt, url);
		
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		
	}	
	
	


	 
}




















