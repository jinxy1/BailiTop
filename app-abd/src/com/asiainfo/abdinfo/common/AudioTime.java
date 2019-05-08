package com.asiainfo.abdinfo.common;

import java.io.File;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.MultimediaInfo;


//用于计算音频的时长
public class AudioTime {
	
   public static void main(String[] args) {
	   Long second=getDuration("E:\\audio\\qiaobusi.mp4");
	   System.out.println(secondToTime(second));
}
   
   
   /**
    * 音频文件获取文件时长
    * @param source
    * @return
    */
   public static Long getDuration(String source) {
	   File file=new File(source);
       Encoder encoder = new Encoder();
       long ls = 0;
       MultimediaInfo m;
       try {
           m = encoder.getInfo(file);
           ls = m.getDuration()/1000;  
       } catch (Exception e) {
           System.out.println("获取音频时长有误：" + e.getMessage());
       }
       return ls;
   }
   
   
   /**
    * 返回日时分秒
    * @param second
    * @return
    */
   public static String secondToTime(long second) {
       long days = second / 86400;//转换天数
       second = second % 86400;//剩余秒数
       long hours = second / 3600;//转换小时数
       second = second % 3600;//剩余秒数
       long minutes = second / 60;//转换分钟
       second = second % 60;//剩余秒数
       if (0 < days){
           return Dou(days) + "-"+Dou(hours)+":"+Dou(minutes)+":"+Dou(second);
       }else {
           return Dou(hours)+":"+Dou(minutes)+":"+Dou(second);
       }
   }
   
   
   
   public static String Dou(long str){
	   if(str<10){
		   return "0"+str;
	   }else{
		   return "0"+str;
	   }
   }


   
   

	
   

	

}
