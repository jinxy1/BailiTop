package com.asiainfo.abdinfo.controller.toolweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**展示团队风采*/
@Controller
public class teamshow {
	@RequestMapping(value="/jumppage.do")
	public String JumpPage(){
		return "jump/jumppage";
	}

}
