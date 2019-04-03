package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.Community;
import com.asiainfo.abdinfo.po.FlowInfoAccapt;
import com.asiainfo.abdinfo.po.NewLoginBean.OtherAdd;

public interface CommunityDao {
	
	/**
	 * 查询所有的部门
	 * @return
	 */ 
	List<String> selectCommunityDep();
	
	
	/**
	 * 插入主表
	 * @param community
	 * @return
	 */
	int insertCommunit(Community community);
	
	

	
	
	void insertInfoAccept(List<FlowInfoAccapt> list );
	
	
	/**
	 * 插入圖片
	 */
	void insertInfoImage(@Param(value="infoId")Integer infoId,@Param(value="infoImg")String infoImg);
	
	
	/**
	 * 查询类型的名称
	 * @return
	 */
	List<String> selectTypeName(@Param(value="staffCode") String staffCode);
	
	
	/**
	 * 插入其他
	 * @param otherAdd
	 */
	void insertOtherType(List<OtherAdd> otherAdd);
	
	
	/**
	 * 根据人员编码查询部门
	 * @return
	 */
	int selectDepID(@Param(value="staffCode") String staffCode);
	
    /**
     * 根据部门ID查询他的全部父级
     * @param id
     * @return
     */
	Map<String, String> selectLevelID(@Param(value="id") Integer id);
	

	
	/**
	 *  首先根据部门名称找到上一级部门id 
	 * @param staffCode
	 * @return
	 */
	int selectOnid(@Param(value="department") String department);
	
	
	/**
	 *  首先根据部门id找到上一级部门id 
	 * @param staffCode
	 * @return
	 */
	int selectOnid(@Param(value="department") Integer department);
	
	
	
	/**
	 *  <!-- 根据部门找到部门ID -->
	 * @param dep
	 * @return
	 */
	int selectDepdepId(@Param(value="dep") String dep);
	
	
	
	/**
	 * 根据部门id判断该部门是否是基层部门 
	 */
	List<String> selectDepBoolean(@Param(value="depID") Integer depID);
	

}





