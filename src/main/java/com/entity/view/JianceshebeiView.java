package com.entity.view;

import com.entity.JianceshebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 监测设备
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
@TableName("jianceshebei")
public class JianceshebeiView  extends JianceshebeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianceshebeiView(){
	}
 
 	public JianceshebeiView(JianceshebeiEntity jianceshebeiEntity){
 	try {
			BeanUtils.copyProperties(this, jianceshebeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
