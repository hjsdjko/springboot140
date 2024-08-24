package com.dao;

import com.entity.JianceshujuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianceshujuVO;
import com.entity.view.JianceshujuView;


/**
 * 监测数据
 * 
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface JianceshujuDao extends BaseMapper<JianceshujuEntity> {
	
	List<JianceshujuVO> selectListVO(@Param("ew") Wrapper<JianceshujuEntity> wrapper);
	
	JianceshujuVO selectVO(@Param("ew") Wrapper<JianceshujuEntity> wrapper);
	
	List<JianceshujuView> selectListView(@Param("ew") Wrapper<JianceshujuEntity> wrapper);

	List<JianceshujuView> selectListView(Pagination page,@Param("ew") Wrapper<JianceshujuEntity> wrapper);
	
	JianceshujuView selectView(@Param("ew") Wrapper<JianceshujuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JianceshujuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JianceshujuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JianceshujuEntity> wrapper);



}
