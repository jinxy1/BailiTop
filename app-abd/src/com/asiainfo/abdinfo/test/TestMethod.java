package com.asiainfo.abdinfo.test;


import java.util.regex.Pattern;

import org.junit.Test;

public class TestMethod {
	

	
	@Test
	public void Test(){
		
	//	".*edu.*[0-9]{7,9}.html"
		
		String pattern="http://.*";
		boolean isMatch1=Pattern.matches( pattern,"http://paper.people.com.cn/rmrbhwb/res/2019-04/03/05/rmrbhwb2019040305p14_b.jpg");
		System.out.println(isMatch1);
			
	}
	


	
	

}
