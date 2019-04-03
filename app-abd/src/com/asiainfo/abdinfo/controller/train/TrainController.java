package com.asiainfo.abdinfo.controller.train;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.po.Train;
import com.asiainfo.abdinfo.service.ITrianService;
/**培训模块*/
@Controller
public class TrainController {

	@Resource
	private ITrianService trianService;
	/**查询培训内容*/
	@RequestMapping(value="train.do")
	@ResponseBody
	public void findTrian(HttpServletRequest request,HttpServletResponse response){
		String date=request.getParameter("date");
		String staffCode=request.getParameter("staffCode");
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("staffCode", staffCode);
		map.put("date", date);
		List<Train> trains=trianService.findTrain(map);
		ResponseUtils.renderJson(response, JsonUtils.toJson(trains));
	}
	
	/**更新培训感想*/
	@RequestMapping(value="updateTrain.do")
	@ResponseBody
	public int updateTrian(String content,String p_ID,String staffCode,HttpServletResponse response){
		int id=Integer.parseInt(p_ID);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("content", content);
		map.put("id", id);
		map.put("staffCode", staffCode);
		return trianService.updateTrain(map);
	}
}
