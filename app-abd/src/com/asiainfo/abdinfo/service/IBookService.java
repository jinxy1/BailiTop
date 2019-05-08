package com.asiainfo.abdinfo.service;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;
import com.asiainfo.abdinfo.po.book.BookChapter;
import com.asiainfo.abdinfo.po.book.BookCommentsInfo;
import com.asiainfo.abdinfo.po.book.BookReaded;
import com.asiainfo.abdinfo.po.book.Books;
import com.asiainfo.abdinfo.utils.mybatis.paginator.domain.PageBounds;

public interface IBookService {
	/**添加书评*/
	public Integer addComments(String sendStaffCode,Integer bookId,String content);
	/**查询所有图书*/
	public List<Books> selectBooks(String staffCode,Integer id);
	/**添加每本书对应每个人的读书信息*/
	public Integer addBookInfo(String staffCode,Integer bookId);
	/**查询章节 、内容和评论*/
	public Map<String, Object> findBookInfo(String staffCode,Integer bookId,PageBounds pb);
	/**插入阅读章节信息*/
	public Integer addReadChapterInfo(String staffCode,Integer bookId,String chapter_id);
	/**根据章节ID查找读书内容*/
	public String findBookChapterById(Integer id);
	/**查询最后一次读书的章节信息*/
	public BookChapter findLastTimeReadChapter(String staffCode, Integer bookId);
	/**查询读书章节*/
	public List<BookChapter> findBookChapter(String staffCode,Integer bookId);
	/**查询书评内容*/
	public List<BookCommentsInfo> findBookReview(String staffCode,Integer bookId,int own);
	
	public Integer changeReviewStatus(ListAllFeeling listAllFeeling);
	
	/**更新读书感想*/
	public Integer updateReadFell(Map<String, Object> map);
	/**查询章节的所有读书感想和评论*/
	public List<BookReaded> findReadFell(Integer bookId,String chapter_id);
}
