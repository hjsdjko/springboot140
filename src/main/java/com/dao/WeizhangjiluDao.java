package com.dao;

import com.entity.WeizhangjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeizhangjiluVO;
import com.entity.view.WeizhangjiluView;


/**
 * 违章记录
 * 
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface WeizhangjiluDao extends BaseMapper<WeizhangjiluEntity> {
	
	List<WeizhangjiluVO> selectListVO(@Param("ew") Wrapper<WeizhangjiluEntity> wrapper);
	
	WeizhangjiluVO selectVO(@Param("ew") Wrapper<WeizhangjiluEntity> wrapper);
	
	List<WeizhangjiluView> selectListView(@Param("ew") Wrapper<WeizhangjiluEntity> wrapper);

	List<WeizhangjiluView> selectListView(Pagination page,@Param("ew") Wrapper<WeizhangjiluEntity> wrapper);
	
	WeizhangjiluView selectView(@Param("ew") Wrapper<WeizhangjiluEntity> wrapper);
	

}
