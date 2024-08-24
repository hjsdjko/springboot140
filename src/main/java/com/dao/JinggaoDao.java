package com.dao;

import com.entity.JinggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinggaoVO;
import com.entity.view.JinggaoView;


/**
 * 警告
 * 
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface JinggaoDao extends BaseMapper<JinggaoEntity> {
	
	List<JinggaoVO> selectListVO(@Param("ew") Wrapper<JinggaoEntity> wrapper);
	
	JinggaoVO selectVO(@Param("ew") Wrapper<JinggaoEntity> wrapper);
	
	List<JinggaoView> selectListView(@Param("ew") Wrapper<JinggaoEntity> wrapper);

	List<JinggaoView> selectListView(Pagination page,@Param("ew") Wrapper<JinggaoEntity> wrapper);
	
	JinggaoView selectView(@Param("ew") Wrapper<JinggaoEntity> wrapper);
	

}
