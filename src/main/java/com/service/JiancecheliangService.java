package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiancecheliangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiancecheliangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiancecheliangView;


/**
 * 监测车辆
 *
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface JiancecheliangService extends IService<JiancecheliangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiancecheliangVO> selectListVO(Wrapper<JiancecheliangEntity> wrapper);
   	
   	JiancecheliangVO selectVO(@Param("ew") Wrapper<JiancecheliangEntity> wrapper);
   	
   	List<JiancecheliangView> selectListView(Wrapper<JiancecheliangEntity> wrapper);
   	
   	JiancecheliangView selectView(@Param("ew") Wrapper<JiancecheliangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiancecheliangEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiancecheliangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiancecheliangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiancecheliangEntity> wrapper);



}

