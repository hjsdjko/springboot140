package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DituEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DituVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DituView;


/**
 * 地图
 *
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface DituService extends IService<DituEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DituVO> selectListVO(Wrapper<DituEntity> wrapper);
   	
   	DituVO selectVO(@Param("ew") Wrapper<DituEntity> wrapper);
   	
   	List<DituView> selectListView(Wrapper<DituEntity> wrapper);
   	
   	DituView selectView(@Param("ew") Wrapper<DituEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DituEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<DituEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<DituEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<DituEntity> wrapper);



}

