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


import com.dao.WeizhangjiluDao;
import com.entity.WeizhangjiluEntity;
import com.service.WeizhangjiluService;
import com.entity.vo.WeizhangjiluVO;
import com.entity.view.WeizhangjiluView;

@Service("weizhangjiluService")
public class WeizhangjiluServiceImpl extends ServiceImpl<WeizhangjiluDao, WeizhangjiluEntity> implements WeizhangjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeizhangjiluEntity> page = this.selectPage(
                new Query<WeizhangjiluEntity>(params).getPage(),
                new EntityWrapper<WeizhangjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeizhangjiluEntity> wrapper) {
		  Page<WeizhangjiluView> page =new Query<WeizhangjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeizhangjiluVO> selectListVO(Wrapper<WeizhangjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeizhangjiluVO selectVO(Wrapper<WeizhangjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeizhangjiluView> selectListView(Wrapper<WeizhangjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeizhangjiluView selectView(Wrapper<WeizhangjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
