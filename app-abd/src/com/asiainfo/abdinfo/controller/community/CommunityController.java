
package com.asiainfo.abdinfo.controller.community;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.asiainfo.abdinfo.po.Community;
import com.asiainfo.abdinfo.po.User;
import com.asiainfo.abdinfo.po.community.CommunityInfoRead;
import com.asiainfo.abdinfo.service.ICommunityService;
import com.asiainfo.abdinfo.service.impl.CommunityServiceImple;
import com.asiainfo.abdinfo.utils.mybatis.paginator.domain.PageBounds;
@Controller
public class CommunityController  {

	@Autowired
	private CommunityServiceImple communityServiceImple;


	@Autowired
	private ICommunityService iCommunityService;
	
	@ResponseBody
	@RequestMapping(value = "communityDep.do", method = RequestMethod.POST)
	public List<String> CommunityDep() {
		return communityServiceImple.getCommunityDep();
	}

	@ResponseBody
	@RequestMapping(value = "communityDataInsert.do", method = RequestMethod.POST)
	public int communityDataDep(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "staffCode") String staffCode, @RequestParam(value = "community") String community) {
		Community con = JSON.parseObject(community, Community.class);
		System.out.println(con);
		con.setStaffCode(staffCode);
		communityServiceImple.insertCommunits(con);
		System.out.println(con.getId());
		return con.getId(); // 返回主鍵
	}

	@ResponseBody
	@RequestMapping(value = "communityImgInsert.do", method = RequestMethod.POST)
	public String communityInsert(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "file", required = false) MultipartFile file,
			@RequestParam(value = "infoId") Integer infoId)  throws IllegalStateException, IOException  {

		if (file != null) { // 判断文件是否为空
			String path = ""; // 文件的路径
			String type = ""; // 文件类型
			String fileName1 = file.getOriginalFilename(); // 文件原名称
			
			String fileName=fileName1.substring(fileName1.lastIndexOf(".",fileName1.lastIndexOf(".")-1)+1, fileName1.length());
			
			//wxda05ced5b87ff9e3.o6zAJs-T1lQ9i58H_9Ra0hxf-k-Q.bzgTEP8eCtlsc94b9d4d2bc4e24ccd4cd090f1bf3aca.jpg
			System.out.println("原文件的名称为" + fileName);
			// DSC_0154 - 副本.JPG
			// 判断文件的类型
			type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".")  +1, fileName.length())
					: null;
			if (type != null) {
				if ("PNG".equals(type.toUpperCase()) || "GIF".equals(type.toUpperCase())
						|| "JPG".equals(type.toUpperCase())) {
					// 项目实际运行发布的路径
					String realPath1 = request.getSession().getServletContext().getRealPath("/");
					
					
					File fileRealPath=new File(realPath1);
					String realPath =fileRealPath.getParent();
					
					System.out.println(realPath1);
					

					File fie = new File(realPath+  "/onloadimg");
					if(!fie.exists()){
						fie.mkdirs();
					}
				//	http://localhost:8080/app-abd/onloadImg/1234565.png
					String trueFileName = String.valueOf(System.currentTimeMillis())+  fileName;
				//	String host=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getServletContext().getContextPath()+"/"+"onloadimg"+"/"+trueFileName;
					
					String host=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+"onloadimg"+"/"+trueFileName;
					System.out.println(host);
					// 自定义文件的名字
				//	String hostTrueFile=host+File.separator+"onloadImg"+File.separator+trueFileName;

					path = realPath + File.separator + "onloadimg"+  File.separator + trueFileName;
					System.out.println("存放图片文件的路径:" + path);
					// 转存文件到指定的路径
					file.transferTo(new File(path));
					communityServiceImple.insertInfoImage(infoId, host);
				}
			} else {
				System.out.println("文件类型为空");
			}
		} else {
			System.out.println("文件为空");
		}
		return "001";
	}


	@ResponseBody
	@RequestMapping(value = "typeName.do", method = RequestMethod.POST)
    public List<String> typeName(HttpServletRequest request){
		String staffCode=request.getParameter("staffCode");
    	return communityServiceImple.getTypeName(staffCode);
    }
	
	@RequestMapping(value="getCommunityInfoType.do")
	@ResponseBody
	public Map<String, Object> getCommunityInfoType(String user,String typeName,HttpServletRequest request) throws InterruptedException{
		//Thread.sleep(2000);
		String pagestr=request.getParameter("page");
		String limitstr=request.getParameter("limit");
		String infoTitle=request.getParameter("infoTitle");
		User users=new User();
		if (user.length()!=0) {
			users=JSON.parseObject(user,User.class);
		}
		int page=Integer.parseInt(pagestr);
		int limit=Integer.parseInt(limitstr);
		PageBounds pb = new PageBounds(page,limit);
		return iCommunityService.getCommunityMsType(users,typeName,pb,infoTitle);
	}
	@RequestMapping(value="changeReadStatus.do")
	@ResponseBody
	public Integer changeReadStatus(String communityInfoReadStr){
		CommunityInfoRead communityInfoRead=JSON.parseObject(communityInfoReadStr,CommunityInfoRead.class);
		Integer status=iCommunityService.changeReadStatus(communityInfoRead);
		return status;
	}
	@RequestMapping(value="getReadCount.do")
	@ResponseBody
	public Integer getReadCount(String communityInfoReadStr){
		CommunityInfoRead communityInfoRead=JSON.parseObject(communityInfoReadStr,CommunityInfoRead.class);
		Integer status=iCommunityService.getReadCount(communityInfoRead);
		return status;
	}
	
	@RequestMapping(value="getUnlessCount.do")
	@ResponseBody
	public Integer getUnlessCount(String user){
		User users=JSON.parseObject(user,User.class);
		return iCommunityService.getunlessMsgCount(users);
	}
	

	
    //根据staffCode查询他所有的部门
	@RequestMapping(value="getDepment.do",method = RequestMethod.POST)
	@ResponseBody
	public List<String> getDep(String staffCode){
		return communityServiceImple.getDepID(staffCode);
	}
	
	
	/**一键已读*/
	@RequestMapping(value="readInfo.do",method = RequestMethod.POST)
	@ResponseBody
	public Integer readInfo(String user){
		User users=JSON.parseObject(user,User.class);
		return iCommunityService.infoRead(users);
	}

	

	
	
	
}
