package com.asiainfo.abdinfo.service;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.book.Books;

public interface IBookService {
	/**添加书评*/
	public Integer updateComments(String staffCode,Integer bookId,String bookReview);
	/**查询所有图书*/
	public List<Books> selectBooks(String staffCode,Integer id);
	/**添加每本书对应每个人的读书信息*/
	public Integer addBookInfo(String staffCode,Integer bookId);
	/**查询章节 、内容和评论*/
	public Map<String, Object> findBookInfo(String staffCode,Integer bookId);
	/**插入阅读章节信息*/
	public Integer addReadChapterInfo(String staffCode,Integer bookId,String chapter_id);
	
	public String findBookChapterById(Integer id);
}
