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


import com.dao.DituDao;
import com.entity.DituEntity;
import com.service.DituService;
import com.entity.vo.DituVO;
import com.entity.view.DituView;

@Service("dituService")
public class DituServiceImpl extends ServiceImpl<DituDao, DituEntity> implements DituService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DituEntity> page = this.selectPage(
                new Query<DituEntity>(params).getPage(),
                new EntityWrapper<DituEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DituEntity> wrapper) {
		  Page<DituView> page =new Query<DituView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DituVO> selectListVO(Wrapper<DituEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DituVO selectVO(Wrapper<DituEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DituView> selectListView(Wrapper<DituEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DituView selectView(Wrapper<DituEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<DituEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<DituEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<DituEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
