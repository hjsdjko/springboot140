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


import com.dao.JianceshujuDao;
import com.entity.JianceshujuEntity;
import com.service.JianceshujuService;
import com.entity.vo.JianceshujuVO;
import com.entity.view.JianceshujuView;

@Service("jianceshujuService")
public class JianceshujuServiceImpl extends ServiceImpl<JianceshujuDao, JianceshujuEntity> implements JianceshujuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianceshujuEntity> page = this.selectPage(
                new Query<JianceshujuEntity>(params).getPage(),
                new EntityWrapper<JianceshujuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianceshujuEntity> wrapper) {
		  Page<JianceshujuView> page =new Query<JianceshujuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianceshujuVO> selectListVO(Wrapper<JianceshujuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianceshujuVO selectVO(Wrapper<JianceshujuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianceshujuView> selectListView(Wrapper<JianceshujuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianceshujuView selectView(Wrapper<JianceshujuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JianceshujuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JianceshujuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JianceshujuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
