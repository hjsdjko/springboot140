package com.dao;

import com.entity.JiancecheliangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiancecheliangVO;
import com.entity.view.JiancecheliangView;


/**
 * 监测车辆
 * 
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface JiancecheliangDao extends BaseMapper<JiancecheliangEntity> {
	
	List<JiancecheliangVO> selectListVO(@Param("ew") Wrapper<JiancecheliangEntity> wrapper);
	
	JiancecheliangVO selectVO(@Param("ew") Wrapper<JiancecheliangEntity> wrapper);
	
	List<JiancecheliangView> selectListView(@Param("ew") Wrapper<JiancecheliangEntity> wrapper);

	List<JiancecheliangView> selectListView(Pagination page,@Param("ew") Wrapper<JiancecheliangEntity> wrapper);
	
	JiancecheliangView selectView(@Param("ew") Wrapper<JiancecheliangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiancecheliangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiancecheliangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiancecheliangEntity> wrapper);



}
