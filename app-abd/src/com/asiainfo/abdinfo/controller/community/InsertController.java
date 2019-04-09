package com.asiainfo.abdinfo.controller.community;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asiainfo.abdinfo.common.Html;
import com.asiainfo.abdinfo.po.Community;
import com.asiainfo.abdinfo.service.impl.CommunityServiceImple;

@Component
public class InsertController {

	@Autowired
	private  CommunityServiceImple communityServi;
	
	private int j; 
	private int y;
	private int z;
	/* 每天凌晨3点执行一次 */
//	@Scheduled(cron = "0 0 5 * * ?")
   //@Scheduled(cron="0 */1 * * * ?")
	public void insertNews() {
		Html thml = new Html();
		String url = "http://www.people.com.cn/";
		String urlName = url.substring(url.indexOf(".") + 1, url.indexOf(".", url.indexOf(".") + 1));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String timeName = sdf.format(new Date());
		String name = urlName + timeName;
		Set<String> urls = thml.getUrls(name, url, "a[href]"); // 全部的url

		String eduPattern = "edu"; 

		String culturePattern = "culture";

		String politicsPattern = "politics";
		for (String s : urls) {
			patternContent(s, eduPattern, "教育新闻", thml);
			patternContent(s, culturePattern, "文化娱乐", thml);
			patternContent(s, politicsPattern, "时政新闻", thml);
		}
		j=0;
		y=0;
		z=0;
	}

	/**
	 * 
	 * @param urls
	 *            每一个连接的地址
	 * @param patt
	 *            正则表达式
	 * @param name
	 *            起的名字
	 * @param thml
	 *            html
	 */
	public  void patternContent(String url, String patt, String name, Html thml) {
		String pattern1 = ".*" + patt + ".*[0-9]{7,9}.html";
		Boolean isMatch = Pattern.matches(pattern1, url);
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MMdd");//设置日期格式
		String pa1tt = ".*"+df.format(new Date())+"*.";
		Boolean is1Match = Pattern.matches(pa1tt, url);
		if (isMatch) {
				Community co = thml.getContent(url.substring(url.lastIndexOf("-") - 1, url.lastIndexOf(".")), url, "div",name);
				System.out.println(co);
				System.out.println("+++++++++++++++++++++++++++");
					if (co.getTitle() != null && co.getContent() != null&&co.getTitle().length() != 0 && co.getContent().length() != 0) {
						if(co.getType().equals("教育新闻")){
							j++;
							if(j>3){
								return;
							}
						}else if(co.getType().equals("文化娱乐")){
							y++;
							if(y>3){
								return;
							}
						}else if(co.getType().equals("时政新闻")){
							z++;
							if(z>3){
								return;
							}
						}else{
							return;
						}
						communityServi.insertCommunits(co);
						if (co.getImages().size() != 0) {
							String pattern = "http://.*";
							for (int i = 0; i < co.getImages().size(); i++) {
								boolean isMatch1 = Pattern.matches(pattern, co.getImages().get(i));
								if (isMatch1&&is1Match) {
									communityServi.insertInfoImage(co.getId(), co.getImages().get(i));
									System.out.println(co);
							}
					}
				}
				}
				
		}
	}
	
}
