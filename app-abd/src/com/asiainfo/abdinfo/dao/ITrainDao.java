package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.Train;
/**培训模块*/
public interface ITrainDao {
	public List<Train> findTrain(Map<String, Object> map);/**查找培训内容*/
	
	public int updateTrain(Map<String, Object> map);/**更新培训感悟*/
}
