package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianceshebeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianceshebeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianceshebeiView;


/**
 * 监测设备
 *
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface JianceshebeiService extends IService<JianceshebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianceshebeiVO> selectListVO(Wrapper<JianceshebeiEntity> wrapper);
   	
   	JianceshebeiVO selectVO(@Param("ew") Wrapper<JianceshebeiEntity> wrapper);
   	
   	List<JianceshebeiView> selectListView(Wrapper<JianceshebeiEntity> wrapper);
   	
   	JianceshebeiView selectView(@Param("ew") Wrapper<JianceshebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianceshebeiEntity> wrapper);
   	

}

