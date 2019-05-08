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

import com.asiainfo.abdinfo.po.ReadClock;
import com.asiainfo.abdinfo.service.impl.ReadClockImple;

public class TestDate { 

	
	@SuppressWarnings({ "unused", "resource" })
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-mvc.xml", "conf/spring-mybatis.xml");
		ReadClockImple rd=(ReadClockImple) ac.getBean("ReadClockService", ReadClockImple.class);
		Map<String,Object> hah= rd.getReadIndex("18060405","2019-05-05");
		System.out.println(hah);
	}	
	


	 
}




















