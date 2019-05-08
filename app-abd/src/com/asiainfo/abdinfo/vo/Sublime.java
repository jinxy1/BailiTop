package com.asiainfo.abdinfo.vo;

public class Sublime {
	
	public String sublimeString(String data){
		String str=data.trim().substring(0,6);
		return str;
	}
	
	public static void main(String[] args) {
		String data="454frgfrgrgtr";
		@SuppressWarnings("unused")
		String str=data.trim().substring(0,6);
	}

}
