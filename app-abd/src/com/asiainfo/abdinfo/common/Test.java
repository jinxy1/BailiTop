package com.asiainfo.abdinfo.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
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
        	System.out.println(contentName);
//        	Community co= thml.getContent(contentName, s, "div");
//        	System.out.println(co);
        }
 
        
	}
}





