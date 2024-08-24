package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinggaoView;


/**
 * 警告
 *
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface JinggaoService extends IService<JinggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinggaoVO> selectListVO(Wrapper<JinggaoEntity> wrapper);
   	
   	JinggaoVO selectVO(@Param("ew") Wrapper<JinggaoEntity> wrapper);
   	
   	List<JinggaoView> selectListView(Wrapper<JinggaoEntity> wrapper);
   	
   	JinggaoView selectView(@Param("ew") Wrapper<JinggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinggaoEntity> wrapper);
   	

}

