package com.asiainfo.abdinfo.controller.version;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.abdinfo.service.IVersionService;
/**控制版本的显示隐藏*/
@Controller
public class VersionController {

	@Resource
	private IVersionService iVersionService;
	
	@RequestMapping(value="version.do")
	@ResponseBody
	public int findVersion(){
		return iVersionService.findVersion();
	}
}
