package com.asiainfo.abdinfo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.abdinfo.dao.IBookDao;
import com.asiainfo.abdinfo.dao.IStutasDao;
import com.asiainfo.abdinfo.po.PageBean;
import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;
import com.asiainfo.abdinfo.po.book.BookChapter;
import com.asiainfo.abdinfo.po.book.BookCommentsInfo;
import com.asiainfo.abdinfo.po.book.Books;
import com.asiainfo.abdinfo.service.IBookService;
import com.asiainfo.abdinfo.utils.mybatis.paginator.domain.PageBounds;
import com.github.pagehelper.PageHelper;
@Service("IBookServiceImpl")
public class IBookServiceImpl implements IBookService{

	@Autowired
	private IBookDao bookDao;
	
	@Autowired
	private IStutasDao iStutasDao;
	
	@Override
	public Integer addComments(String sendStaffCode,Integer bookId,String content) {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bookDao.addComments(sendStaffCode,bookId,content);
	}

	@Override
	public List<Books> selectBooks(String staffCode,Integer id) {
		
		List<Books> list=bookDao.selectBooks(staffCode,id);
		for (Books books : list) {
			Integer percentInteger=books.getPercent();
			if (percentInteger==100&&books.getStatus()!=1) {
				bookDao.updateReadAll(staffCode,books.getId());
				list=bookDao.selectBooks(staffCode,id);
			}
		}
		return list;
	}

	@Override
	@Transactional
	public Integer addBookInfo(String staffCode, Integer bookId) {
		Integer status=bookDao.findBookInfoCount(staffCode, bookId);
		if (status!=null&&status==0) {
			return bookDao.addBookInfo(staffCode, bookId);
		}else {
			return -1;
		}
		
	}

	@Override
	public Map<String, Object> findBookInfo(String staffCode,Integer bookId,PageBounds pb) {
		
		System.out.println(System.currentTimeMillis());
		System.out.println("开始时间");
		Map<String, Object> map = new HashMap<String, Object>(); 
		BookChapter bChapter=findLastTimeReadChapter(staffCode, bookId);
		List<BookChapter> bChapters=findBookChapter(staffCode,bookId);
		PageHelper.startPage(pb.getPage(), pb.getLimit());
		List<BookCommentsInfo> bInfos=findBookReview(staffCode, bookId,0);
		PageBean<BookCommentsInfo>  pageBean  = new PageBean<BookCommentsInfo>(bInfos);
		List<BookCommentsInfo> ownReview=new ArrayList<BookCommentsInfo>();
		for (BookCommentsInfo bookCommentsInfo : bInfos) {
			if (bookCommentsInfo.getSendStaffCode().equals(staffCode)) {
				ownReview.add(bookCommentsInfo);
			}
		}
		map.put("bChapter", bChapter);
		map.put("bChapters", bChapters);
		map.put("bInfos", pageBean);
		map.put("ownReview", ownReview);
		System.out.println(System.currentTimeMillis());
		System.out.println("结束时间");
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

	@Override
	public BookChapter findLastTimeReadChapter(String staffCode, Integer bookId) {
		// TODO Auto-generated method stub
		return bookDao.findLastTimeReadChapter(staffCode, bookId);
	}

	@Override
	public List<BookChapter> findBookChapter(String staffCode, Integer bookId) {
		// TODO Auto-generated method stub
		return bookDao.findBookChapter(staffCode, bookId);
	}

	@Override
	public List<BookCommentsInfo> findBookReview(String staffCode, Integer bookId,int own) {
		// TODO Auto-generated method stub
		return bookDao.findBookReview(staffCode, bookId,own);
	}
	/**更新点赞收藏超赞的状态*/
	@Override
	public Integer changeReviewStatus(ListAllFeeling listAllFeeling) {
		if (listAllFeeling.getNickName().equals("praise")) {
			Integer existInteger=iStutasDao.existPraise(listAllFeeling.getStaffCode(), listAllFeeling.getId());
			if (existInteger>0) {
				iStutasDao.deletePraise(listAllFeeling);
			}else {
				iStutasDao.addPraise(listAllFeeling);
				int existNum=iStutasDao.existInfo(listAllFeeling.getStaffCode(),listAllFeeling.getClockDirectory(),"点赞");
				if (existNum<=0) {
					iStutasDao.insertLike(listAllFeeling);
					iStutasDao.insertLikeAccept(listAllFeeling);
				}
			}
		}else if (listAllFeeling.getNickName().equals("fabulous")) {
			Integer existInteger=iStutasDao.existFabulous(listAllFeeling.getStaffCode(), listAllFeeling.getId());
			if (existInteger>0) {
				iStutasDao.deleteFabulous(listAllFeeling);
			}else {
				iStutasDao.addFabulous(listAllFeeling);
				int existNum=iStutasDao.existInfo(listAllFeeling.getStaffCode(),listAllFeeling.getClockDirectory(),"超赞");
				if(existNum<=0){
					iStutasDao.insertFabulousInfo(listAllFeeling);
					iStutasDao.insertFabulousInfoAccpet(listAllFeeling);
				}
			}
		}else if(listAllFeeling.getNickName().equals("myenshrine")) {
			Integer existInteger=iStutasDao.existEnshrine(listAllFeeling.getStaffCode(), listAllFeeling.getId());
			if (existInteger>0) {
				iStutasDao.deleteEnshrine(listAllFeeling);
			}else {
				iStutasDao.addEnshrine(listAllFeeling);
				int existNum=iStutasDao.existInfo(listAllFeeling.getStaffCode(),listAllFeeling.getClockDirectory(),"收藏");
				if (existNum<=0) {
					iStutasDao.insertEnshrineInfo(listAllFeeling);
					iStutasDao.insertEnshrineInfoAccpet(listAllFeeling);
				}
			}
		}
		return 1;
	}

	@Override
	public Integer updateReadFell(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return bookDao.updateReadFell(map);
	}



}
