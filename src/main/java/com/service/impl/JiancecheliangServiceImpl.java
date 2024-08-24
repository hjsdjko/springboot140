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


import com.dao.JiancecheliangDao;
import com.entity.JiancecheliangEntity;
import com.service.JiancecheliangService;
import com.entity.vo.JiancecheliangVO;
import com.entity.view.JiancecheliangView;

@Service("jiancecheliangService")
public class JiancecheliangServiceImpl extends ServiceImpl<JiancecheliangDao, JiancecheliangEntity> implements JiancecheliangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiancecheliangEntity> page = this.selectPage(
                new Query<JiancecheliangEntity>(params).getPage(),
                new EntityWrapper<JiancecheliangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiancecheliangEntity> wrapper) {
		  Page<JiancecheliangView> page =new Query<JiancecheliangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiancecheliangVO> selectListVO(Wrapper<JiancecheliangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiancecheliangVO selectVO(Wrapper<JiancecheliangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiancecheliangView> selectListView(Wrapper<JiancecheliangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiancecheliangView selectView(Wrapper<JiancecheliangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JiancecheliangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JiancecheliangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JiancecheliangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
