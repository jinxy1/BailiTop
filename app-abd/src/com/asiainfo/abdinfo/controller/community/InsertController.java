package com.asiainfo.abdinfo.controller.community;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.asiainfo.abdinfo.common.Html;
import com.asiainfo.abdinfo.po.Community;
import com.asiainfo.abdinfo.service.impl.CommunityServiceImple;

@Component
public class InsertController {
	
	@Autowired
	private CommunityServiceImple communityServi;
	
	/*每天凌晨3点执行一次*/
	@Scheduled(cron="0 0 3 * * ?")
//	@Scheduled(cron="0 */1 * * * ?")
	public void insertNews(){
		Html thml = new Html();
		String url = "http://www.people.com.cn/";
		String urlName = url.substring(url.indexOf(".") + 1, url.indexOf(".", url.indexOf(".") + 1));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String timeName = sdf.format(new Date());
		String name = urlName + timeName;
		Set<String> urls = thml.getUrls(name, url, "a[href]"); // 全部的url

		String eduPattern = ".*edu.*[0-9]{7,9}.html";

		String politicsPattern = ".*politics.*[0-9]{7,9}.html";

		for (String ur : urls) {
			Boolean isMatch = Pattern.matches(eduPattern, ur); // 教育类的匹配

			Boolean isMatchPolitics = Pattern.matches(politicsPattern, ur); // 行政类的匹配

			if (isMatch) {
				Community co = thml.getContent(ur.substring(ur.lastIndexOf("-") - 1, ur.lastIndexOf(".")), ur, "div","教育新闻");
				if (co.getTitle() != null && co.getContent() != null) {
					communityServi.insertCommunits(co);
				//	http://paper.people.com.cn/rmrb/res/2019-04/03/10/rmrb2019040310p32_b.jpg
					if(co.getImages().size()!=0){
						String pattern="http://.*";
						for(int i=0;i<co.getImages().size();i++){
							boolean isMatch1=Pattern.matches(pattern,co.getImages().get(i));
							if(isMatch1){
								if(co.getTitle().length()!=0&&co.getContent().length()!=0){
									communityServi.insertInfoImage(co.getId(), co.getImages().get(i));
								}
							}
						}
					}
				}
			}
			
			if(isMatchPolitics){
				Community co = thml.getContent(ur.substring(ur.lastIndexOf("-") - 1, ur.lastIndexOf(".")), ur, "div","时政新闻");
				if (co.getTitle() != null && co.getContent() != null) {
					communityServi.insertCommunits(co);
					if(co.getImages().size()!=0){
						String pattern="http://.*";
						for(int i=0;i<co.getImages().size();i++){
							boolean isMatch1=Pattern.matches(pattern,co.getImages().get(i));
							if(isMatch1){
								if(co.getTitle().length()!=0&&co.getContent().length()!=0){
									communityServi.insertInfoImage(co.getId(), co.getImages().get(i));
								}
							}
						}
					}
				}
			}
		
		
	}
	}
}
