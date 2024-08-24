package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JianceshebeiEntity;
import com.entity.view.JianceshebeiView;

import com.service.JianceshebeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 监测设备
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
@RestController
@RequestMapping("/jianceshebei")
public class JianceshebeiController {
    @Autowired
    private JianceshebeiService jianceshebeiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianceshebeiEntity jianceshebei,
		HttpServletRequest request){
        EntityWrapper<JianceshebeiEntity> ew = new EntityWrapper<JianceshebeiEntity>();

		PageUtils page = jianceshebeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianceshebei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianceshebeiEntity jianceshebei, 
		HttpServletRequest request){
        EntityWrapper<JianceshebeiEntity> ew = new EntityWrapper<JianceshebeiEntity>();

		PageUtils page = jianceshebeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianceshebei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianceshebeiEntity jianceshebei){
       	EntityWrapper<JianceshebeiEntity> ew = new EntityWrapper<JianceshebeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianceshebei, "jianceshebei")); 
        return R.ok().put("data", jianceshebeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianceshebeiEntity jianceshebei){
        EntityWrapper< JianceshebeiEntity> ew = new EntityWrapper< JianceshebeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianceshebei, "jianceshebei")); 
		JianceshebeiView jianceshebeiView =  jianceshebeiService.selectView(ew);
		return R.ok("查询监测设备成功").put("data", jianceshebeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianceshebeiEntity jianceshebei = jianceshebeiService.selectById(id);
        return R.ok().put("data", jianceshebei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianceshebeiEntity jianceshebei = jianceshebeiService.selectById(id);
        return R.ok().put("data", jianceshebei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianceshebeiEntity jianceshebei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jianceshebei);
        jianceshebeiService.insert(jianceshebei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianceshebeiEntity jianceshebei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jianceshebei);
        jianceshebeiService.insert(jianceshebei);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JianceshebeiEntity jianceshebei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianceshebei);
        jianceshebeiService.updateById(jianceshebei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianceshebeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	







    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,JianceshebeiEntity jianceshebei, HttpServletRequest request){
        EntityWrapper<JianceshebeiEntity> ew = new EntityWrapper<JianceshebeiEntity>();
        int count = jianceshebeiService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianceshebei), params), params));
        return R.ok().put("data", count);
    }



}
