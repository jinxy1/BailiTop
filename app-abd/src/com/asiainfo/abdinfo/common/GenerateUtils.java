package com.asiainfo.abdinfo.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class GenerateUtils {
	
	/**
	 * 将String型转化为数组类型
	 * @param content
	 * @return
	 */
	public static List<Map<String,String>> generate(String content){
		String pattern="\\【|】";   //将字符串分割开的正则表达式
		String imgPattern = ".+(.JPEG|.jpeg|.JPG|.jpg|.png)$";
		String contents[]=content.split(pattern);
		List<Map<String,String>> lists=new ArrayList<Map<String,String>>();
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
