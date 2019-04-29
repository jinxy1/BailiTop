package com.asiainfo.abdinfo.controller.book;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.asiainfo.abdinfo.common.GenerateUtils;
import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;
import com.asiainfo.abdinfo.po.book.BookCommentsInfo;
import com.asiainfo.abdinfo.po.book.Books;
import com.asiainfo.abdinfo.service.IBookService;
import com.asiainfo.abdinfo.utils.mybatis.paginator.domain.PageBounds;

@Controller
public class CommentsController {

	@Autowired
	private IBookService bookService;
	@RequestMapping("addComments.do")
	@ResponseBody
	public Integer addComments(String staffCode,Integer bookId,String content){
		return bookService.addComments(staffCode,bookId,content);
	}
	@RequestMapping("findBooks.do")
	@ResponseBody
	public List<Books> books(String staffCode, Integer id) {
		return bookService.selectBooks(staffCode, id);
	}

	@RequestMapping("addBookInfo.do")
	@ResponseBody
	public Integer addBookInfo(String staffCode, Integer bookId) {
		return bookService.addBookInfo(staffCode, bookId);
	}

	@RequestMapping("findBookInfo.do")
	@ResponseBody
	public Map<String, Object> findBookInfo(String staffCode,Integer bookId,Integer page,Integer limit ){
		PageBounds pb = new PageBounds(page,limit);
		return bookService.findBookInfo(staffCode, bookId,pb);
	}

	@RequestMapping("addReadChapterInfo.do")
	@ResponseBody
	public Integer addReadChapterInfo(String staffCode, Integer bookId, String chapter_id) {
		return bookService.addReadChapterInfo(staffCode, bookId, chapter_id);
	}
	/**根据id查询读书内容*/

	@RequestMapping(value = "findBookChapterById.do", produces = "application/json;charset=utf-8")
	@ResponseBody
	public List<Map> findBookChapterById(Integer id) {
		String contentString = bookService.findBookChapterById(id);
		return GenerateUtils.generate(contentString);
	}
	
	/**更新评论的点赞超赞收藏状态*/
	@RequestMapping("changeReviewStatus.do")
	@ResponseBody
	public Integer changeReviewStatus(String bookInfoStr){
		BookCommentsInfo bookCommentsInfo=JSON.parseObject(bookInfoStr,BookCommentsInfo.class);
		ListAllFeeling listAllFeeling=new ListAllFeeling();
		listAllFeeling.setClockDirectory(bookCommentsInfo.getContent());
		listAllFeeling.setId(bookCommentsInfo.getId());
		listAllFeeling.setStaffCode(bookCommentsInfo.getAcceptStaffCode());
		listAllFeeling.setStaffCoded(bookCommentsInfo.getSendStaffCode());
		listAllFeeling.setPraise(bookCommentsInfo.getPraise().toString());
		listAllFeeling.setNickName(bookCommentsInfo.getType());
		return bookService.changeReviewStatus(listAllFeeling);
	}
	
	/**自己的评论*/
	@RequestMapping("changeReview.do")
	@ResponseBody
	public List<BookCommentsInfo> changeReview(String staffCode,Integer bookId){
		
		return bookService.findBookReview(staffCode, bookId,1);
	}
	
	
	
}
	


	
	
	
