package com.asiainfo.abdinfo.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
	/**
	    *改方法用于判断时间
	    * @param str
	    * @return
	 * @throws ParseException 
	    */
		public static boolean judgeTime(String str1)  {
			Date currentDate = new Date();
			boolean flage=false;
		    try {
		    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 10:00:00");
				SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String str=str1.trim().substring(0, 19);	
				Date date = sdf1.parse(str);    //传入的时间
				Date begindate = DateFormat.getDateTimeInstance().parse(sdf.format(currentDate));
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DAY_OF_YEAR, 1);
				Date endDate1 = calendar.getTime();
				Date endDate = DateFormat.getDateTimeInstance().parse(sdf.format(endDate1));
			
				/**
				 * 如果result==0  两个时间相等
				 *    result<0 date1>date2        并且date1是括号里的数
				 *    result>0 date1<date2
				 */   
				 int beginResult=date.compareTo(begindate);
				 int endResult=date.compareTo(endDate);
				if(beginResult>=0&&endResult<=0){
			    	return  flage=true;
			    }
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
		    
		   return flage;
		}

}
