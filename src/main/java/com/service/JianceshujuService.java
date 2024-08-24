package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianceshujuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianceshujuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianceshujuView;


/**
 * 监测数据
 *
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface JianceshujuService extends IService<JianceshujuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianceshujuVO> selectListVO(Wrapper<JianceshujuEntity> wrapper);
   	
   	JianceshujuVO selectVO(@Param("ew") Wrapper<JianceshujuEntity> wrapper);
   	
   	List<JianceshujuView> selectListView(Wrapper<JianceshujuEntity> wrapper);
   	
   	JianceshujuView selectView(@Param("ew") Wrapper<JianceshujuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianceshujuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JianceshujuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JianceshujuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JianceshujuEntity> wrapper);



}

