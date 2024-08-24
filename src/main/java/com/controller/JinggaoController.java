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

import com.entity.JinggaoEntity;
import com.entity.view.JinggaoView;

import com.service.JinggaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 警告
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
@RestController
@RequestMapping("/jinggao")
public class JinggaoController {
    @Autowired
    private JinggaoService jinggaoService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JinggaoEntity jinggao,
		HttpServletRequest request){
        EntityWrapper<JinggaoEntity> ew = new EntityWrapper<JinggaoEntity>();

		PageUtils page = jinggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jinggao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JinggaoEntity jinggao, 
		HttpServletRequest request){
        EntityWrapper<JinggaoEntity> ew = new EntityWrapper<JinggaoEntity>();

		PageUtils page = jinggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jinggao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JinggaoEntity jinggao){
       	EntityWrapper<JinggaoEntity> ew = new EntityWrapper<JinggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jinggao, "jinggao")); 
        return R.ok().put("data", jinggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JinggaoEntity jinggao){
        EntityWrapper< JinggaoEntity> ew = new EntityWrapper< JinggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jinggao, "jinggao")); 
		JinggaoView jinggaoView =  jinggaoService.selectView(ew);
		return R.ok("查询警告成功").put("data", jinggaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JinggaoEntity jinggao = jinggaoService.selectById(id);
        return R.ok().put("data", jinggao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JinggaoEntity jinggao = jinggaoService.selectById(id);
        return R.ok().put("data", jinggao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JinggaoEntity jinggao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jinggao);
        jinggaoService.insert(jinggao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JinggaoEntity jinggao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jinggao);
        jinggaoService.insert(jinggao);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JinggaoEntity jinggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jinggao);
        jinggaoService.updateById(jinggao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jinggaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
