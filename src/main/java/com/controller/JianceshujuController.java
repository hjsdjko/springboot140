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

import com.entity.JianceshujuEntity;
import com.entity.view.JianceshujuView;

import com.service.JianceshujuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 监测数据
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
@RestController
@RequestMapping("/jianceshuju")
public class JianceshujuController {
    @Autowired
    private JianceshujuService jianceshujuService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianceshujuEntity jianceshuju,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shijianend,
		HttpServletRequest request){
        EntityWrapper<JianceshujuEntity> ew = new EntityWrapper<JianceshujuEntity>();
                if(shijianstart!=null) ew.ge("shijian", shijianstart);
                if(shijianend!=null) ew.le("shijian", shijianend);

		PageUtils page = jianceshujuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianceshuju), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianceshujuEntity jianceshuju, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shijianend,
		HttpServletRequest request){
        EntityWrapper<JianceshujuEntity> ew = new EntityWrapper<JianceshujuEntity>();
                if(shijianstart!=null) ew.ge("shijian", shijianstart);
                if(shijianend!=null) ew.le("shijian", shijianend);

		PageUtils page = jianceshujuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianceshuju), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianceshujuEntity jianceshuju){
       	EntityWrapper<JianceshujuEntity> ew = new EntityWrapper<JianceshujuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianceshuju, "jianceshuju")); 
        return R.ok().put("data", jianceshujuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianceshujuEntity jianceshuju){
        EntityWrapper< JianceshujuEntity> ew = new EntityWrapper< JianceshujuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianceshuju, "jianceshuju")); 
		JianceshujuView jianceshujuView =  jianceshujuService.selectView(ew);
		return R.ok("查询监测数据成功").put("data", jianceshujuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianceshujuEntity jianceshuju = jianceshujuService.selectById(id);
        return R.ok().put("data", jianceshuju);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianceshujuEntity jianceshuju = jianceshujuService.selectById(id);
        return R.ok().put("data", jianceshuju);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianceshujuEntity jianceshuju, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jianceshuju);
        jianceshujuService.insert(jianceshuju);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianceshujuEntity jianceshuju, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jianceshuju);
        jianceshujuService.insert(jianceshuju);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JianceshujuEntity jianceshuju, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianceshuju);
        jianceshujuService.updateById(jianceshuju);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianceshujuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	






    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<JianceshujuEntity> ew = new EntityWrapper<JianceshujuEntity>();
        List<Map<String, Object>> result = jianceshujuService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计(多)）
     */
    @RequestMapping("/valueMul/{xColumnName}")
    public R valueMul(@PathVariable("xColumnName") String xColumnName,@RequestParam String yColumnNameMul, HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<JianceshujuEntity> ew = new EntityWrapper<JianceshujuEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = jianceshujuService.selectValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<JianceshujuEntity> ew = new EntityWrapper<JianceshujuEntity>();
        List<Map<String, Object>> result = jianceshujuService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型(多)
     */
    @RequestMapping("/valueMul/{xColumnName}/{timeStatType}")
    public R valueMulDay(@PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,@RequestParam String yColumnNameMul,HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("timeStatType", timeStatType);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<JianceshujuEntity> ew = new EntityWrapper<JianceshujuEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = jianceshujuService.selectTimeStatValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<JianceshujuEntity> ew = new EntityWrapper<JianceshujuEntity>();
        List<Map<String, Object>> result = jianceshujuService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }




    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,JianceshujuEntity jianceshuju, HttpServletRequest request){
        EntityWrapper<JianceshujuEntity> ew = new EntityWrapper<JianceshujuEntity>();
        int count = jianceshujuService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianceshuju), params), params));
        return R.ok().put("data", count);
    }



}
