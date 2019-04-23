package com.asiainfo.abdinfo.controller.book;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.abdinfo.po.book.Books;
import com.asiainfo.abdinfo.service.IBookService;

@Controller
public class CommentsController {

	@Autowired
	private IBookService bookService;
	@RequestMapping("updateComments.do")
	@ResponseBody
	public Integer updateComments(String staffCode,Integer bookId,String bookReview){
		return bookService.updateComments(staffCode,bookId,bookReview);
	}
	@RequestMapping("findBooks.do")
	@ResponseBody
	public List<Books> books(String staffCode,Integer id){
		return bookService.selectBooks(staffCode,id);
	}
	
	@RequestMapping("addBookInfo.do")
	@ResponseBody
	public Integer addBookInfo(String staffCode,Integer bookId){
		return bookService.addBookInfo(staffCode, bookId);
	}
	
	@RequestMapping("findBookInfo.do")
	@ResponseBody
	public Map<String, Object> findBookInfo(String staffCode,Integer bookId){
		return bookService.findBookInfo(staffCode, bookId);
	}
	
	@RequestMapping("addReadChapterInfo.do")
	@ResponseBody
	public Integer addReadChapterInfo(String staffCode, Integer bookId, String chapter_id){
		return bookService.addReadChapterInfo(staffCode, bookId, chapter_id);
	}
	
	@RequestMapping(value="findBookChapterById.do",produces="application/json;charset=utf-8")
	@ResponseBody
	public String findBookChapterById(Integer id){
		String contentString=bookService.findBookChapterById(id);
		return contentString;
	}
	
}
