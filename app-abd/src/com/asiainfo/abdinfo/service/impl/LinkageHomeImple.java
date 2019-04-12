package com.asiainfo.abdinfo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.common.CurrentTime;
import com.asiainfo.abdinfo.dao.CalendarDao;
import com.asiainfo.abdinfo.dao.LinkageHomeDao;
import com.asiainfo.abdinfo.po.Calendar;
import com.asiainfo.abdinfo.po.ReadClock;
import com.asiainfo.abdinfo.service.linkageHomeService;

@Service("linkageHomeService")
public class LinkageHomeImple implements linkageHomeService{
	
	/** 首页点击封面获取书单 */ 
	@Autowired
	private LinkageHomeDao linkageHomeDao;
	
	@Autowired
	private CalendarDao calendarDao;
	

	@Override
	public List<ReadClock> getLinkage(Map<String,Object> map) {
		return linkageHomeDao.findLinkage(map);	
	}
   
	/**
	 * 节约空间弄日历
	 */
	@Override
	public List<Calendar> selectCalendarContent(String staffCode, String date) {
		List<Calendar> attend=getAttendance( staffCode,  date);
		return attend;
	}
  
	/**
	 * 考勤表
	 */
	@Override
	public List<Calendar> getAttendance(String staffCode, String date) {
		long startTime=System.currentTimeMillis();
		String beforeDay=CurrentTime.getSpecifiedDayBefore(date);
		Calendar  beforeCalendar=calendarDao.selectBefore(staffCode,beforeDay);  //查询出前一天的日期
		
		System.out.println(beforeCalendar);
		
		System.out.println();
		
		List<String> downWorkListfdf=new ArrayList<String>();
		if(beforeCalendar==null){
			 beforeCalendar=new Calendar(beforeDay.substring(8, 10)+"号打卡下班时间",downWorkListfdf,"moonRound","");
		}else{
			beforeCalendar.setIcon("moonRound");
		}

		List<String>  calendarTime=calendarDao.selectAttendance(staffCode, date);     //打卡(按指纹)记录        若空未打卡    若不为空打卡
		System.out.println(calendarTime.size());
		List<Calendar>  calendar=new ArrayList<Calendar>();    //存放上下班的集合
		Calendar goWork=new Calendar();          //存放上班的对象
		Calendar downWork=new Calendar();          //存放下班的对象
		
		goWork.setProject("上班时间");
		downWork.setProject("下班时间");
		goWork.setIcon("sumRound");
		downWork.setIcon("moonRound");
		List<String> goWorkList=new ArrayList<String>();
		List<String> downWorkList=new ArrayList<String>();
		
		if(calendarTime.size()!=0){  //打卡
			//当多条记录时
			String maxDate=calendarTime.get(0);      //最大值 
			String minDate=calendarTime.get(0);      //最小值
			for(int i=0;i<calendarTime.size();i++){
				//如果只有一条打卡记录
				if(calendarTime.size()==1){  
					int calendarInt=Integer.parseInt(calendarTime.get(i).substring(0, 2));		//从数据库中查出的小时						
					if(calendarInt<12){
						//上班

						minDate=calendarTime.get(i);
						maxDate="";
					
					}else{
					   //下班	
						minDate="";
						maxDate=calendarTime.get(i);
					}
				}else{
					System.out.println(calendarTime.get(i).compareTo("12:00:00"));
					
					//若有多条打卡记录
					if(calendarTime.get(i).compareTo("12:00:00")<0){   //上午
						System.out.println(calendarTime.get(i));
						if(calendarTime.get(i).compareTo(minDate)<=0){
							 minDate=calendarTime.get(i);  //最小 minDate
							 if(maxDate.compareTo("12:00:00")<0){
								 maxDate="";
							 }
						}
					}else{
						if(calendarTime.get(i).compareTo(maxDate)>=0){  //下午
							 maxDate =calendarTime.get(i);  //最大 maxDate
							 if(minDate.compareTo("12:00:00")>0){
								 minDate="";
							 }
							
						}
					}
				}
			}
			goWorkList.add(minDate);
			downWorkList.add(maxDate);
		}else{           //未打卡
			int minDate=0;
			int maxDate=0;
			goWorkList.add(intConversion(minDate));
			downWorkList.add(intConversion(maxDate));

		}
		
		goWork.setContents(goWorkList);
		downWork.setContents(downWorkList);
		System.out.println(calendar);
		List<Calendar> cal=calendarDao.selectCalendarContent( staffCode,  date);
		cal.add(0,goWork);
		cal.add(downWork);
		cal.add(0,beforeCalendar);


	    System.out.println(cal);
	    long begtinTime=System.currentTimeMillis();
	    System.out.println("--------------考勤所用时间-------------------"+(begtinTime-startTime));
	    return cal;
	}

	
    //将String型 转化为int 型
	/*private int dateConversion(String str){
		int a=Integer.parseInt(str.substring(0,2))*60*60;
		int b =Integer.parseInt(str.substring(3,5))*60;
		int c=Integer.parseInt(str.substring(6,8));
		int tatal=a+b+c;
		return tatal;
	}*/

	
	//将int类型转化为String型
	private String intConversion(int str){
		if(str==0){
			return "";
		}
		int a=str/60/60;    //时
		int b=str/60%60;    //分
		int c=str%60;       //秒
		String total=a+":"+b+":"+c;
		return total;
	}

	
	/**
	 * 判断是否有读书内容
	 */
	@Override
	public String judgeRead(String staffCode, String date) {
		
		return calendarDao.judgeRead(staffCode, date);
	}

	
//	[
//	Calendar [project=22, contents=[08:23:26, 18:30:20], icon=null, stutas=3], 
//	 Calendar [project=23, contents=[08:24:01, 18:12:27], icon=null, stutas=6]
//	 ]	
	
	
	


	
	 
	



}




