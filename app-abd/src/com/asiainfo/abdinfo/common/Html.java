package com.asiainfo.abdinfo.common;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.asiainfo.abdinfo.po.Community;
@SuppressWarnings("rawtypes")
public class Html { 

	// 根据url从网络获取网页文本
	public Document getHtmlTextByUrl(String url) {
		Document doc = null;
		try {
			// doc = Jsoup.connect(url).timeout(5000000).get();
			int i = (int) (Math.random() * 1000); // 做一个随机延时，防止网站屏蔽
			while (i != 0) {
				i--;
			}
			doc = Jsoup.connect(url).data("query", "Java").userAgent("Mozilla").cookie("auth", "token").timeout(300000).get();
		} catch (IOException e) {
			e.printStackTrace();
			try {
				doc = Jsoup.connect(url).timeout(5000000).get();
				((Connection) doc).header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
				((Connection) doc).header("Accept-Encoding", "gzip, deflate, sdch");
				((Connection) doc).header("Accept-Language", "zh-CN,zh;q=0.8");
				((Connection) doc).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
			} catch (IOException e1) { 
				e1.printStackTrace();
			}
		}
		return doc;
	}

	// 根据本地路径获取网页文本，如果不存在就通过url从网络获取并保存

	public Document getHtmlTextByPath(String name, String url) {
		String path = "D:/Html/" + name + ".html";
		Document doc = null;
		File input = new File(path);
		try {
			doc = Jsoup.parse(input, "GBK");
			if (!doc.children().isEmpty()) {
				System.out.println("已经存在");
			}
		} catch (IOException e) {
			System.out.println("文件未找到，正在从网络获取.......");
			doc = this.getHtmlTextByUrl(url);
			// 并且保存到本地
//			this.Save_Html(url, name);
		}
		return doc;
	} // 此处为保存网页的函数

	// 将网页保存在本地（通过url,和保存的名字）
	public void Save_Html(String url, String name) {
		try {
			name = name + ".html";
			// System.out.print(name);
			File dest = new File("D:/Html/" + name);// D:\Html
			// 接收字节输入流
			InputStream is;
			// 字节输出流
			FileOutputStream fos = new FileOutputStream(dest);

			URL temp = new URL(url);
			is = temp.openStream();

			// 为字节输入流加缓冲
			BufferedInputStream bis = new BufferedInputStream(is);
			// 为字节输出流加缓冲
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			int length;

			byte[] bytes = new byte[1024 * 20];
			while ((length = bis.read(bytes, 0, bytes.length)) != -1) {
				fos.write(bytes, 0, length);
			}

			bos.close();
			fos.close();
			bis.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 根据元素属性获取某个元素内的elements列表
	public Elements getEleByClass(Document doc, String className) {
		Elements elements = null;
		elements = doc.select(className);// 这里把我们获取到的html文本doc，和工具class名，注意<tr// class="provincetr">
		return elements; // 此处返回的就是所有的tr集合
	}

	// 获取省 、市 、县等的信息
	
	public ArrayList getProvince(String name, String url, String type) {
		ArrayList result = new ArrayList();
		// "tr.provincetr"
		String classtype = "tr." + type;
		// 从网络上获取网页
		Document doc2 = this.getHtmlTextByPath(name, url);
		if (doc2 != null) {
			Elements es = this.getEleByClass(doc2, classtype); // tr的集合
			for (Element e : es) // 依次循环每个元素，也就是一个tr
			{
				if (e != null) {
					for (Element ec : e.children()) // 一个tr的子元素td，td内包含a标签
					{
						String[] prv = new String[4]; // 身份的信息： 原来的url（当前url）
														// 名称（北京）
														// 现在url（也就是北京的url）
														// 类型（prv）省
						if (ec.children().first() != null) {
							// 原来的url
							prv[0] = url; // 就是参数url
							// 身份名称
							System.out.println(ec.children().first().ownText());
							prv[1] = ec.children().first().ownText(); // a标签文本
																// 如:北京
							String ownurl = ec.children().first().attr("abs:href"); // 北京的url
							System.out.println(ownurl);
						}
					}
				}
			}
		}
		System.out.println(result);
		return result; // 反回所有的省份信息集合，存数据库，字段类型为： baseurl name ownurl
						// levelname（type） updatetime
	}


	
	/**
	 * 获取url  添加全部的url
	 * @param name
	 * @param url
	 * @param type
	 */
	public Set<String> getUrls(String name,String url,String type){
		Document doc2 = this.getHtmlTextByPath(name, url);
		Set<String> politics =new HashSet<String>(); 
		if(doc2!=null){
			Elements es = this.getEleByClass(doc2, type);    // tr的集合
		//展示各种类型的新闻
		//教育： edu   politics:行政                          sports:体育  ent: 娱乐新闻  
//			String sportsPattern = ".*politics.*[0-9]{7,9}.html";
//			String eduPattern=".*edu.*[0-9]{7,9}.html";
			//用于存放所有政治类的链接
			for(Element e:es){
				//所有的url
				String urls=e.attr("href").trim();
//				Boolean isMatch =Pattern.matches(sportsPattern, urls);
//				if(isMatch){
//					politics.add(urls);
//				}
				politics.add(urls);
			}
		}
		return politics;
		
	}
	
	
	
	public Community getContent(String name,String url,String type,String urlName){
		Community conmmunity=new Community();
		Document doc2=this.getHtmlTextByPath(name, url);
		if(doc2!=null){
			String title=this.getEleByClass(doc2, "div.text_title").select("h1").text();    //标题
			String content="";
			Elements pEle=this.getEleByClass(doc2, "div.text_con_left").select("p");    //内容
			for(Element e:pEle){
				String pp=e.text();
				content=content+pp+"\n";
			}
			
			if(title.length()!=0&&content.length()!=0){
				Elements es=this.getEleByClass(doc2, "div.text_con_left").select("table").select("img");   //图片
				List<String> imgs=new ArrayList<String>();
				for(Element e:es){
					imgs.add(e.attr("src"));
				}
				conmmunity.setType(urlName);
				conmmunity.setStaffCode("18060405");
				conmmunity.setArrData(new ArrayList<String>(Arrays.asList("公司")));
				conmmunity.setTitle(title.trim());
				conmmunity.setContent(content.trim());
				conmmunity.setImages(imgs);
			}
			
		}
		return conmmunity;
		
	}
	
	


}





