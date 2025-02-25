package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JianceshebeiDao;
import com.entity.JianceshebeiEntity;
import com.service.JianceshebeiService;
import com.entity.vo.JianceshebeiVO;
import com.entity.view.JianceshebeiView;

@Service("jianceshebeiService")
public class JianceshebeiServiceImpl extends ServiceImpl<JianceshebeiDao, JianceshebeiEntity> implements JianceshebeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianceshebeiEntity> page = this.selectPage(
                new Query<JianceshebeiEntity>(params).getPage(),
                new EntityWrapper<JianceshebeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianceshebeiEntity> wrapper) {
		  Page<JianceshebeiView> page =new Query<JianceshebeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianceshebeiVO> selectListVO(Wrapper<JianceshebeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianceshebeiVO selectVO(Wrapper<JianceshebeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianceshebeiView> selectListView(Wrapper<JianceshebeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianceshebeiView selectView(Wrapper<JianceshebeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
