package com.asiainfo.abdinfo.service;

import java.util.List;
import java.util.Map;


import com.asiainfo.abdinfo.po.Train;

public interface ITrianService {
	public List<Train> findTrain(Map<String, Object> map);
	public int updateTrain(Map<String, Object> map);
}
