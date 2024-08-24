package com.entity.view;

import com.entity.WeizhangjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 违章记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
@TableName("weizhangjilu")
public class WeizhangjiluView  extends WeizhangjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeizhangjiluView(){
	}
 
 	public WeizhangjiluView(WeizhangjiluEntity weizhangjiluEntity){
 	try {
			BeanUtils.copyProperties(this, weizhangjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
