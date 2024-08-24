package com.entity.model;

import com.entity.DituEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 地图
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public class DituModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 数量
	 */
	
	private Integer value;
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setValue(Integer value) {
		this.value = value;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getValue() {
		return value;
	}
			
}
