package com.asiainfo.abdinfo.dao;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.feedback.FeedBackInfo;

public interface FeedBackDao {
	
	
	int insertFeedBack(FeedBackInfo fbIf);
	
	
	void insertFeedBackImg(@Param(value="foreign") Integer foreign,@Param(value="path")String trueFileName);

}
