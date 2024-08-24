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


import com.dao.HuanjingDao;
import com.entity.HuanjingEntity;
import com.service.HuanjingService;
import com.entity.vo.HuanjingVO;
import com.entity.view.HuanjingView;

@Service("huanjingService")
public class HuanjingServiceImpl extends ServiceImpl<HuanjingDao, HuanjingEntity> implements HuanjingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanjingEntity> page = this.selectPage(
                new Query<HuanjingEntity>(params).getPage(),
                new EntityWrapper<HuanjingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanjingEntity> wrapper) {
		  Page<HuanjingView> page =new Query<HuanjingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanjingVO> selectListVO(Wrapper<HuanjingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanjingVO selectVO(Wrapper<HuanjingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanjingView> selectListView(Wrapper<HuanjingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanjingView selectView(Wrapper<HuanjingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<HuanjingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<HuanjingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<HuanjingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
