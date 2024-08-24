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


import com.dao.JinggaoDao;
import com.entity.JinggaoEntity;
import com.service.JinggaoService;
import com.entity.vo.JinggaoVO;
import com.entity.view.JinggaoView;

@Service("jinggaoService")
public class JinggaoServiceImpl extends ServiceImpl<JinggaoDao, JinggaoEntity> implements JinggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinggaoEntity> page = this.selectPage(
                new Query<JinggaoEntity>(params).getPage(),
                new EntityWrapper<JinggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinggaoEntity> wrapper) {
		  Page<JinggaoView> page =new Query<JinggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinggaoVO> selectListVO(Wrapper<JinggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinggaoVO selectVO(Wrapper<JinggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinggaoView> selectListView(Wrapper<JinggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinggaoView selectView(Wrapper<JinggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
