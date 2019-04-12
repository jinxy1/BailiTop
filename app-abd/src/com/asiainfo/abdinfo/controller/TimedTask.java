package com.asiainfo.abdinfo.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.asiainfo.abdinfo.dao.WX;
import com.asiainfo.abdinfo.po.DataWX;
import com.asiainfo.abdinfo.po.demo.AccessProfile;
import com.asiainfo.abdinfo.po.demo.AccessProfileTatal;
import com.asiainfo.abdinfo.po.demo.AccessRecord;
import com.asiainfo.abdinfo.po.demo.AccessRecordContent;
import com.asiainfo.abdinfo.po.demo.DataDistribution;
import com.asiainfo.abdinfo.po.demo.DataDistributionContent;
import com.asiainfo.abdinfo.po.demo.DataDistributionTatal;
import com.asiainfo.abdinfo.po.demo.PageAccessTatal;
import com.asiainfo.abdinfo.po.demo.VisitorTrending;
import com.asiainfo.abdinfo.po.demo.VisitorTrendingTatal;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

@Component
public class TimedTask {
	
	@Autowired
	private WX wx;
	
	@Scheduled(cron = "0 0 4 * * ?")
	public String getAccess_token() {
		String access_token = "";
		@SuppressWarnings("unused")
		PrintWriter out = null;
		BufferedReader in = null;
		DataWX dataWX = null;
		URL url = null;
		try {
			url = new URL("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxda05ced5b87ff9e3&secret=c6a37f44d4653bad24d0e87489774372");// 用url路径以及所用参数创建URL实例类
			URLConnection connect = url.openConnection();// 创建连接
			connect.setRequestProperty("content-type", "application/x-www-form-urlencoded;charset=utf-8");// 设置请求header的属性--请求内容类型
			connect.setRequestProperty("method", "GET");// 设置请求header的属性值--请求方式
			// 建立实际的连接
			connect.connect(); // 建立与url所在服务器的连接
			
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
			String line = "";
			while ((line = in.readLine()) != null) {
				access_token += line;
			}
			dataWX = JSON.parseObject(access_token, DataWX.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		access_token = dataWX.getAccess_token();
		return access_token;
		
	}
	public String[] getDate(){
		Calendar ca = Calendar.getInstance();//得到一个Calendar的实例 
		ca.setTime(new Date()); //设置时间为当前时间 
		ca.add(Calendar.DATE, -1); //年份减1 
		Date lastMonth = ca.getTime();
		SimpleDateFormat f=new SimpleDateFormat("yyyyMdd");
		SimpleDateFormat fz=new SimpleDateFormat("yyyy-MM-dd");
		String date=f.format(lastMonth);
		String ref_date=fz.format(lastMonth);
		String[] dates=new String[]{date,ref_date};
		return dates;
	}
	@Scheduled(cron = "* * 4 * * ?")
	public void getData(){
		String[] urls=new String[]{
				"getweanalysisappiddailyretaininfo",
				"getweanalysisappiddailysummarytrend",
				"getweanalysisappiddailyvisittrend",
				"getweanalysisappiduserportrait",							
				"getweanalysisappidvisitpage",							
		};
		String content="";
		String date=getDate()[0];
		String ref_date=getDate()[1];
		String access_token=getAccess_token();
		Map<String, Object> map = new HashMap<>();
		map.put("begin_date", date);
		map.put("end_date", date);
		String jsonString = JSON.toJSONString(map);
		if (access_token != "" && access_token != null) {
			try {
				for(int i=0;i<urls.length;i++){
					String url = "https://api.weixin.qq.com/datacube/"+urls[i]+"?access_token=" + access_token;
					HttpRequest request;
					String encoding = "utf-8";
					request = HttpRequest.post(url).charset(encoding).bodyText(jsonString);
					HttpResponse response = request.send();
					content = new String(response.bodyBytes(), encoding);
					System.out.println(content);
					switch (i) {
					case 0:
						AccessRecord demo=JSON.parseObject(content, AccessRecord.class);
						List<AccessRecordContent> demo1=demo.getVisit_uv();
						Integer visit_uv=null;
						for (AccessRecordContent demo2 : demo1) {
							visit_uv=demo2.getValue();
						}
						
						List<AccessRecordContent> demo2=demo.getVisit_uv_new();
						Integer visit_uv_new=null;
						for (AccessRecordContent demo22 : demo2) {
							visit_uv_new=demo22.getValue();
						}
						wx.add1(ref_date, visit_uv_new, visit_uv);
						System.out.println(demo.toString());
						break;
					case 1:
						AccessProfileTatal aTatal=JSON.parseObject(content,AccessProfileTatal.class);
						List<AccessProfile> aTatals=aTatal.getList();
						if(aTatals.size()!=0){
							wx.add3(aTatals.get(0));
						}
						break;
					case 2:
						VisitorTrendingTatal vTatal=JSON.parseObject(content,VisitorTrendingTatal.class);
						List<VisitorTrending> vTrendings=vTatal.getList();
						if(vTrendings.size()!=0){
							wx.add2(vTrendings.get(0));
						}
						break;
					case 3:
						DataDistributionTatal dTatal=JSON.parseObject(content, DataDistributionTatal.class);
						DataDistributionContent dataVisit_uv_new=dTatal.getVisit_uv_new();
						List<DataDistribution> listAgesNew=dataVisit_uv_new.getAges();
						wx.add4(listAgesNew,dTatal.getRef_date(),"ages","新");
						List<DataDistribution> listProvinceNew=dataVisit_uv_new.getProvince();
						wx.add4(listProvinceNew,dTatal.getRef_date(),"province","新");
						List<DataDistribution> listPlatformsNew=dataVisit_uv_new.getPlatforms();
						wx.add4(listPlatformsNew,dTatal.getRef_date(),"platforms","新");
						List<DataDistribution> listGendersNew=dataVisit_uv_new.getGenders();
						wx.add4(listGendersNew,dTatal.getRef_date(),"genders","新");
						List<DataDistribution> listDevicesNew=dataVisit_uv_new.getDevices();
						wx.add4(listDevicesNew,dTatal.getRef_date(),"devices","新");
						List<DataDistribution> listCityNew=dataVisit_uv_new.getCity();
						wx.add4(listCityNew,dTatal.getRef_date(),"city","新");
						
						DataDistributionContent dataVisit_uv=dTatal.getVisit_uv();
						List<DataDistribution> listAges=dataVisit_uv.getAges();
						wx.add4(listAges,dTatal.getRef_date(),"ages","老");
						List<DataDistribution> listProvince=dataVisit_uv.getProvince();
						wx.add4(listProvince,dTatal.getRef_date(),"province","老");
						List<DataDistribution> listPlatforms=dataVisit_uv.getPlatforms();
						wx.add4(listPlatforms,dTatal.getRef_date(),"platforms","老");
						List<DataDistribution> listGenders=dataVisit_uv.getGenders();
						wx.add4(listGenders,dTatal.getRef_date(),"genders","老");
						List<DataDistribution> listDevices=dataVisit_uv.getDevices();
						wx.add4(listDevices,dTatal.getRef_date(),"devices","老");
						List<DataDistribution> listCity=dataVisit_uv.getCity();
						wx.add4(listCity,dTatal.getRef_date(),"city","老");
						
						break;
					case 4:
						PageAccessTatal pTatal=JSON.parseObject(content, PageAccessTatal.class);
						wx.add5(pTatal);
						break;
					default:
						break;
					}
				}
				
				
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
	}

}
