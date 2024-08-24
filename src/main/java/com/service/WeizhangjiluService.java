package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeizhangjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeizhangjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeizhangjiluView;


/**
 * 违章记录
 *
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public interface WeizhangjiluService extends IService<WeizhangjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeizhangjiluVO> selectListVO(Wrapper<WeizhangjiluEntity> wrapper);
   	
   	WeizhangjiluVO selectVO(@Param("ew") Wrapper<WeizhangjiluEntity> wrapper);
   	
   	List<WeizhangjiluView> selectListView(Wrapper<WeizhangjiluEntity> wrapper);
   	
   	WeizhangjiluView selectView(@Param("ew") Wrapper<WeizhangjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeizhangjiluEntity> wrapper);
   	

}

