package com.asiainfo.abdinfo.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDate { 

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-mvc.xml", "conf/spring-mybatis.xml");
		FutureTask<Integer> future=new FutureTask<>(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				System.out.println(ac);
				return null;
			}
		}) ;
		new Thread(future).start();
		ExecutorService eService=Executors.newFixedThreadPool(5);
		eService.submit(future);
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




















