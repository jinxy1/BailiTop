package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.book.BookChapter;
import com.asiainfo.abdinfo.po.book.BookCommentsInfo;
import com.asiainfo.abdinfo.po.book.BookReaded;
import com.asiainfo.abdinfo.po.book.Books;
/**公告内容的dao接口*/
public interface IBookDao {
	/**添加书评*/
	public Integer addComments(
			@Param("sendStaffCode") String sendStaffCode,
			@Param("book_id") Integer bookId,
			@Param("content") String content
	);
	/**查询所有读书内容*/
	public List<Books> selectBooks(@Param("staffCode") String staffCode,@Param("id") Integer id);
	/**插入每本书对应的每个人的读书信息前先查询是否已经存在对应信息*/
	public Integer findBookInfoCount(
			@Param("staffCode") String staffCode,
			@Param("bookId") Integer bookId
	);
	/**插入每本书对应的每个人的读书信息*/
	public Integer addBookInfo(
			@Param("staffCode") String staffCode,
			@Param("bookId") Integer bookId
	);
	
	/**查询最后一次读书的章节信息*/
	public BookChapter findLastTimeReadChapter(
			@Param("staffCode") String staffCode,
			@Param("book_id") Integer bookId
	);
	/**查询读书章节*/
	public List<BookChapter> findBookChapter(
			@Param("staffCode") String staffCode,
			@Param("book_id") Integer bookId
	);
	/**查询书评内容*/
	public List<BookCommentsInfo> findBookReview(
			@Param("staffCode") String staffCode,
			@Param("book_id") Integer bookId,
			@Param("own") int own
	);
	
	/**查询章节是否已读*/
	public Integer findChapterStatus(
			
			@Param("staffCode") String staffCode,
			@Param("book_id") Integer bookId,
			@Param("chapter_id") String chapter_id
	);
	/**章节未读的话插入阅读章节信息*/
	public Integer addReadChapterInfo(
			@Param("staffCode") String staffCode,
			@Param("book_id") Integer bookId,
			@Param("chapter_id") String chapter_id
	);
	/**更新最后一次所读章节的时间*/
	public Integer updateReadChapterInfo(
			@Param("staffCode") String staffCode,
			@Param("book_id") Integer bookId,
			@Param("chapter_id") String chapter_id
	);
	/**更新所读书籍为以读完*/
	public Integer updateReadAll(
			@Param("staffCode") String staffCode,
			@Param("book_id") Integer bookId
	);
	/**根据id查找章节内容*/
	public String findBookChapterById(
			@Param("id") Integer id
	);
	/**更新读书感想*/
	public Integer updateReadFell(Map<String, Object> map);
	/**查询章节的所有读书感想和评论*/
	public List<BookReaded> findReadFell(
			@Param("bookId") Integer bookId,
			@Param("chapterId") String chapterId
	);
	
	
	
	
	
	
	
	
}
