package com.asiainfo.abdinfo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.regex.Pattern;

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
//		mlcvp = ac.getBean("IBookServiceImpl", IBookServiceImpl.class);
//		String content=mlcvp.findBookChapterById(11);
//		List<Map> a=generate( content);
	
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




















