package com.asiainfo.abdinfo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.abdinfo.service.IBookService;
import com.asiainfo.abdinfo.service.impl.IBookServiceImpl;

public class TestDate { 

	
	@Test
	public void test() {
		IBookService mlcvp;
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-mvc.xml", "conf/spring-mybatis.xml");
		mlcvp = ac.getBean("IBookServiceImpl", IBookServiceImpl.class);
		String content=mlcvp.findBookChapterById(11);
		List<Map> a=generate( content);
	
	}
	
	public  List<Map> generate(String content){
		String pattern="\\【|】";   //将字符串分割开的正则表达式
		String imgPattern = ".+(.JPEG|.jpeg|.JPG|.jpg|.png)$";
		String contents[]=content.split(pattern);
		List<Map> lists=new ArrayList<Map>();
		for(String con:contents){
			Map<String,String> map=new HashMap<String,String>();
			Boolean isMatch=Pattern.matches(imgPattern, con);
			if(isMatch){
				map.put("img", con);
			}else{
				map.put("test", con);
			}
			lists.add(map);
		}
		return lists;
	}
	
	
	

	
	
	


	 
}




















