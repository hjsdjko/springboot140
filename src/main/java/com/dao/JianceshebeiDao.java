package com.dao;

import com.entity.JianceshebeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianceshebeiVO;
import com.entity.view.JianceshebeiView;


/**
 * 监测设备
 * 
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface JianceshebeiDao extends BaseMapper<JianceshebeiEntity> {
	
	List<JianceshebeiVO> selectListVO(@Param("ew") Wrapper<JianceshebeiEntity> wrapper);
	
	JianceshebeiVO selectVO(@Param("ew") Wrapper<JianceshebeiEntity> wrapper);
	
	List<JianceshebeiView> selectListView(@Param("ew") Wrapper<JianceshebeiEntity> wrapper);

	List<JianceshebeiView> selectListView(Pagination page,@Param("ew") Wrapper<JianceshebeiEntity> wrapper);
	
	JianceshebeiView selectView(@Param("ew") Wrapper<JianceshebeiEntity> wrapper);
	

}
