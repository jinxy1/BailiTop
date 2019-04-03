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
//		for(String s:urls){
//			System.out.println(s);
//		}
		
		String pattern="edu";
		
		String eduPattern = ".*"+pattern+".*[0-9]{7,9}.html";
		System.out.println(eduPattern);
		
		String politicsPattern = ".*politics.*[0-9]{7,9}.html";
		
		for (String ur : urls) {
			Boolean isMatch = Pattern.matches(eduPattern, ur); // 教育类的匹配
		
			Boolean isMatchPolitics = Pattern.matches(politicsPattern, ur); // 行政类的匹配
		
			if (isMatch) {
				Community co = thml.getContent(ur.substring(ur.lastIndexOf("-") - 1, ur.lastIndexOf(".")), ur, "div","教育新闻");
				if (co.getTitle() != null && co.getContent() != null) {
					System.out.println(co);

					mlcvp.insertCommunits(co);
					if(co.getImages().size()!=0){
						for(int i=0;i<co.getImages().size();i++){
							mlcvp.insertInfoImage(co.getId(), co.getImages().get(i));
						}
					}
				}
			}
			
			if(isMatchPolitics){
				Community co = thml.getContent(ur.substring(ur.lastIndexOf("-") - 1, ur.lastIndexOf(".")), ur, "div","时政新闻");
				if (co.getTitle() != null && co.getContent() != null) {
					System.out.println(co);
//					mlcvp.insertCommunits(co);
				}
			}
		}
		
		
		
	



	}
	
	
	/**
	 *    
	 * @param urls
	 * @param patt
	 * @param name
	 * @param thml
	 */
	 public void patternContent(String url,String patt,String name,Html thml){
		 String pattern = ".*"+patt+".*[0-9]{7,9}.html";
		 System.out.println(pattern);
			 Boolean isMatch=Pattern.matches(pattern, url);
			 if(isMatch){
				 Community co = thml.getContent(url.substring(url.lastIndexOf("-") - 1, url.lastIndexOf(".")), url, "div",name);
					if (co.getTitle() != null && co.getContent() != null) {
						System.out.println(co);
//						mlcvp.insertCommunits(co);
			 }
		 }
	 }

	 
}




















