package com.asiainfo.abdinfo.po;

import java.io.Serializable;
import java.util.List;
import com.asiainfo.abdinfo.po.NewLoginBean.OtherAdd;

public class Community implements Serializable {

	private static final long serialVersionUID = -1979799408999750602L;
	
	private Integer id;

	private String type;

	private String title;

	private String content;
	
	//发送人的人员编码
	private String staffCode;   
 
	//插入所有可以看得人
	private List<String> arrData;

	//插入图片集合
	private List<String> images;
	
	//插入添加其他
	private List<OtherAdd> arrType;
	
	//信息创建时间
//	private String infoCurrentTime ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public List<String> getArrData() {
		return arrData;
	}

	public void setArrData(List<String> arrData) {
		this.arrData = arrData;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public List<OtherAdd> getArrType() {
		return arrType;
	}

	public void setArrType(List<OtherAdd> arrType) {
		this.arrType = arrType;
	}

	@Override
	public String toString() {
		return "Community [id=" + id + ", type=" + type + ", title=" + title + ", content=" + content + ", staffCode="
				+ staffCode + ", arrData=" + arrData + ", images=" + images + ", arrType=" + arrType + "]";
	}

	

	
	}

	


	

	
	
	

	
	
	
	


