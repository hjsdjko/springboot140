package com.dao;

import com.entity.DituEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DituVO;
import com.entity.view.DituView;


/**
 * 地图
 * 
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface DituDao extends BaseMapper<DituEntity> {
	
	List<DituVO> selectListVO(@Param("ew") Wrapper<DituEntity> wrapper);
	
	DituVO selectVO(@Param("ew") Wrapper<DituEntity> wrapper);
	
	List<DituView> selectListView(@Param("ew") Wrapper<DituEntity> wrapper);

	List<DituView> selectListView(Pagination page,@Param("ew") Wrapper<DituEntity> wrapper);
	
	DituView selectView(@Param("ew") Wrapper<DituEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DituEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DituEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DituEntity> wrapper);



}
