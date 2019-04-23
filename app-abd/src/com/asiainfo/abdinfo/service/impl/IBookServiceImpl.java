package com.asiainfo.abdinfo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.IBookDao;
import com.asiainfo.abdinfo.po.book.BookChapter;
import com.asiainfo.abdinfo.po.book.BookInfo;
import com.asiainfo.abdinfo.po.book.Books;
import com.asiainfo.abdinfo.service.IBookService;
/**评论内容*/
@Service("IBookServiceImpl")
public class IBookServiceImpl implements IBookService{

	@Autowired
	private IBookDao bookDao;
	
	@Override
	public Integer updateComments(String staffCode,Integer bookId,String bookReview) {
		
		return bookDao.updateComments(staffCode,bookId,bookReview);
	}

	@Override
	public List<Books> selectBooks(String staffCode,Integer id) {
		
		List<Books> list=bookDao.selectBooks(staffCode,id);
		for (Books books : list) {
			Integer percentInteger=books.getPercent();
			if (percentInteger==100&&books.getStatus()!=1) {
				System.out.println("没有进去");
				bookDao.updateReadAll(staffCode,books.getId());
				list=bookDao.selectBooks(staffCode,id);
			}
		}
		return list;
	}

	@Override
	public Integer addBookInfo(String staffCode, Integer bookId) {
		Integer status=bookDao.findBookInfoCount(staffCode, bookId);
		if (status!=null&&status==0) {
			return bookDao.addBookInfo(staffCode, bookId);
		}else {
			return -1;
		}
		
	}

	@Override
	public Map<String, Object> findBookInfo(String staffCode,Integer bookId) {
		System.out.println(System.currentTimeMillis());
		System.out.println("开始时间");
		Map<String, Object> map = new HashMap<String, Object>(); 
		BookChapter bChapter=bookDao.findLastTimeReadChapter(staffCode, bookId);
		System.out.println(System.currentTimeMillis());
		System.out.println("结束时间");
		List<BookChapter> bChapters=bookDao.findBookChapter(staffCode,bookId);
		List<BookInfo> bInfos=bookDao.findBookReview(staffCode, bookId);
		map.put("bChapter", bChapter);
		map.put("bChapters", bChapters);
		map.put("bInfos", bInfos);
		return map;
	}

	@Override
	public Integer addReadChapterInfo(String staffCode, Integer bookId, String chapter_id) {
		Integer status=bookDao.findChapterStatus(staffCode, bookId, chapter_id);
		if (status!=null&&status==0) {
			return bookDao.addReadChapterInfo(staffCode, bookId, chapter_id);
		}else if(status!=null&&status>0){
			return bookDao.updateReadChapterInfo(staffCode, bookId, chapter_id);
		}
		return -1;
	}

	@Override
	public String findBookChapterById(Integer id) {
		return bookDao.findBookChapterById(id);
	}

}
