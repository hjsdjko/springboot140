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

import com.entity.WeizhangjiluEntity;
import com.entity.view.WeizhangjiluView;

import com.service.WeizhangjiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 违章记录
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
@RestController
@RequestMapping("/weizhangjilu")
public class WeizhangjiluController {
    @Autowired
    private WeizhangjiluService weizhangjiluService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WeizhangjiluEntity weizhangjilu,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shijianend,
		HttpServletRequest request){
        EntityWrapper<WeizhangjiluEntity> ew = new EntityWrapper<WeizhangjiluEntity>();
                if(shijianstart!=null) ew.ge("shijian", shijianstart);
                if(shijianend!=null) ew.le("shijian", shijianend);

		PageUtils page = weizhangjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weizhangjilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WeizhangjiluEntity weizhangjilu, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shijianend,
		HttpServletRequest request){
        EntityWrapper<WeizhangjiluEntity> ew = new EntityWrapper<WeizhangjiluEntity>();
                if(shijianstart!=null) ew.ge("shijian", shijianstart);
                if(shijianend!=null) ew.le("shijian", shijianend);

		PageUtils page = weizhangjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weizhangjilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WeizhangjiluEntity weizhangjilu){
       	EntityWrapper<WeizhangjiluEntity> ew = new EntityWrapper<WeizhangjiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( weizhangjilu, "weizhangjilu")); 
        return R.ok().put("data", weizhangjiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WeizhangjiluEntity weizhangjilu){
        EntityWrapper< WeizhangjiluEntity> ew = new EntityWrapper< WeizhangjiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( weizhangjilu, "weizhangjilu")); 
		WeizhangjiluView weizhangjiluView =  weizhangjiluService.selectView(ew);
		return R.ok("查询违章记录成功").put("data", weizhangjiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WeizhangjiluEntity weizhangjilu = weizhangjiluService.selectById(id);
        return R.ok().put("data", weizhangjilu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WeizhangjiluEntity weizhangjilu = weizhangjiluService.selectById(id);
        return R.ok().put("data", weizhangjilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WeizhangjiluEntity weizhangjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(weizhangjilu);
        weizhangjiluService.insert(weizhangjilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WeizhangjiluEntity weizhangjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(weizhangjilu);
        weizhangjiluService.insert(weizhangjilu);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WeizhangjiluEntity weizhangjilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(weizhangjilu);
        weizhangjiluService.updateById(weizhangjilu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        weizhangjiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	







    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,WeizhangjiluEntity weizhangjilu, HttpServletRequest request){
        EntityWrapper<WeizhangjiluEntity> ew = new EntityWrapper<WeizhangjiluEntity>();
        int count = weizhangjiluService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weizhangjilu), params), params));
        return R.ok().put("data", count);
    }



}
