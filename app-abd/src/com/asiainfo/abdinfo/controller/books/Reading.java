package com.asiainfo.abdinfo.controller.books;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.asiainfo.abdinfo.po.reads.Readingbook;
import com.asiainfo.abdinfo.service.impl.ReadsServiceImple;

@Controller
public class Reading {
	
	@Autowired
	private ReadsServiceImple readsServiceImple;
	
	
	@ResponseBody
	@RequestMapping("/bookName.do")
	public List<Readingbook> reading(){
		return readsServiceImple.bookRead();
	}
	
	
	/**
	 * 读书时长排行
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/readTime.do")
	public String readTime(HttpServletRequest request){
		String staffCode=request.getParameter("staffCode");
		return readsServiceImple.getTotalTime(staffCode);
	}

}



