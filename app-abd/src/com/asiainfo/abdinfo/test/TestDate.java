package com.asiainfo.abdinfo.test;

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
		
//		Comments cts=new Comments();
//		cts.setAcceptStaffCode("18060404");
//		cts.setChapterId(1);
//		cts.setContent("哈哈");
//		cts.setSendStaffCode("18060405");
//		cts.setType("评论");
//		mlcvp.addComments(cts);
//		Map<String, Object> map=mlcvp.findBookInfo("18060404", 1);
//		for (Map.Entry<String, Object> entry : map.entrySet()) {
//			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//		}
	}
	
//	@Test
//	public void test1() {
//		String url="http://industry.people.com.cn/n1/2019/0404/c413883-31013059.html";
//		SimpleDateFormat df = new SimpleDateFormat("yyyy/MMdd");//设置日期格式
//		String patt = ".*"+df.format(new Date())+"*.";
//		Boolean isMatch = Pattern.matches(patt, url);
//		System.out.println(isMatch);
//		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
//		
//	}	
	
	


	 
}




















