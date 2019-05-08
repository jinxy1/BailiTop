package com.asiainfo.abdinfo.po.book;

import java.io.Serializable;
import java.util.List;

import com.asiainfo.abdinfo.po.community.FlowLeaveWordChild;

public class BookCommentsInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6458297786832768716L;
	private Integer id;
	private String sendStaffCode;
	private String type;
	private String content;
	private String createTime;
	private String acceptStaffCode;
	private Integer bookId;

	private Integer praise;
	private Integer fabulous;
	private Integer myenshrine;
	private Integer praiseStatus;
	private Integer fabulousStatus;
	private Integer myenshrineStatus;
	private String headPortrait;
	private String name;
	private List<FlowLeaveWordChild> leaveWordChild;
	public BookCommentsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "BookCommentsInfo [id=" + id + ", sendStaffCode=" + sendStaffCode + ", type=" + type + ", content="
				+ content + ", createTime=" + createTime + ", acceptStaffCode=" + acceptStaffCode + ", bookId=" + bookId
				+ ", praise=" + praise + ", fabulous=" + fabulous + ", myenshrine=" + myenshrine + ", praiseStatus="
				+ praiseStatus + ", fabulousStatus=" + fabulousStatus + ", myenshrineStatus=" + myenshrineStatus
				+ ", headPortrait=" + headPortrait + ", name=" + name + ", leaveWordChild="
				+ (leaveWordChild != null ? leaveWordChild.subList(0, Math.min(leaveWordChild.size(), maxLen)) : null)
				+ "]";
	}
	BookCommentsInfo(Integer id, String sendStaffCode, String type, String content, String createTime,
			String acceptStaffCode, Integer bookId, Integer praise, Integer fabulous, Integer myenshrine,
			Integer praiseStatus, Integer fabulousStatus, Integer myenshrineStatus, String headPortrait, String name,
			List<FlowLeaveWordChild> leaveWordChild) {
		super();
		this.id = id;
		this.sendStaffCode = sendStaffCode;
		this.type = type;
		this.content = content;
		this.createTime = createTime;
		this.acceptStaffCode = acceptStaffCode;
		this.bookId = bookId;
		this.praise = praise;
		this.fabulous = fabulous;
		this.myenshrine = myenshrine;
		this.praiseStatus = praiseStatus;
		this.fabulousStatus = fabulousStatus;
		this.myenshrineStatus = myenshrineStatus;
		this.headPortrait = headPortrait;
		this.name = name;
		this.leaveWordChild = leaveWordChild;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSendStaffCode() {
		return sendStaffCode;
	}
	public void setSendStaffCode(String sendStaffCode) {
		this.sendStaffCode = sendStaffCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getAcceptStaffCode() {
		return acceptStaffCode;
	}
	public void setAcceptStaffCode(String acceptStaffCode) {
		this.acceptStaffCode = acceptStaffCode;
	}
	public Integer getChapterId() {
		return bookId;
	}
	public void setChapterId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getPraise() {
		return praise;
	}
	public void setPraise(Integer praise) {
		this.praise = praise;
	}
	public Integer getFabulous() {
		return fabulous;
	}
	public void setFabulous(Integer fabulous) {
		this.fabulous = fabulous;
	}
	public Integer getMyenshrine() {
		return myenshrine;
	}
	public void setMyenshrine(Integer myenshrine) {
		this.myenshrine = myenshrine;
	}
	public String getHeadPortrait() {
		return headPortrait;
	}
	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getPraiseStatus() {
		return praiseStatus;
	}

	public void setPraiseStatus(Integer praiseStatus) {
		this.praiseStatus = praiseStatus;
	}

	public Integer getFabulousStatus() {
		return fabulousStatus;
	}

	public void setFabulousStatus(Integer fabulousStatus) {
		this.fabulousStatus = fabulousStatus;
	}

	public Integer getMyenshrineStatus() {
		return myenshrineStatus;
	}

	public void setMyenshrineStatus(Integer myenshrineStatus) {
		this.myenshrineStatus = myenshrineStatus;
	}
	public List<FlowLeaveWordChild> getLeaveWordChild() {
		return leaveWordChild;
	}
	public void setLeaveWordChild(List<FlowLeaveWordChild> leaveWordChild) {
		this.leaveWordChild = leaveWordChild;
	}
	
}
