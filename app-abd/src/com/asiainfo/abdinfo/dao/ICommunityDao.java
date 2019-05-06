package com.asiainfo.abdinfo.dao;
/**社区内容接口*/

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.User;
import com.asiainfo.abdinfo.po.community.CommunityInfo;
import com.asiainfo.abdinfo.po.community.CommunityInfoRead;
import com.asiainfo.abdinfo.po.community.CommunityInfoType;
import com.asiainfo.abdinfo.po.community.CommunityLeaveWord;
import com.asiainfo.abdinfo.po.community.FlowLeaveWordChild;

public interface ICommunityDao {
	
	public List<CommunityInfoType> getCommunityMsgType();/**获取社区信息类型*/
	public List<CommunityInfo> getCommunityMsg(
			@Param("user") User user,
			@Param("typeName") String typeName,
			@Param("infoTitle") String infoTitle
			);/**获取社区信息*/
	
	public Integer getReadInfo(CommunityInfoRead communityInfoRead);
	public Integer addReadInfo(CommunityInfoRead communityInfoRead);
	public List<CommunityInfoType> getUnlessMsgCount(@Param("user") User user);
	public String getAuthority(@Param("staffCode") String staffCode);
	public List<Integer> getUnlessMsgId(@Param("user") User user);//未读信息id
	public int addReadInfos(@Param("ids") List<Integer> ids,@Param("staffCode") String staffCode);//未读信息id
	public int updateIntegralStatus(@Param("infoId") Integer infoId,@Param("staffCode") String staffCode);//未读信息id
	public Integer addLeaveWord(CommunityLeaveWord cLeaveWord);//插入留言信息
	public Integer addRecoverStruct(FlowLeaveWordChild fLeaveWordChild);//插入回复信息
	public List<CommunityLeaveWord> findLeaveWord(@Param("infoId") Integer infoId);//留言信息
	
	
}
