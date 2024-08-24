package com.entity.vo;

import com.entity.DituEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 地图
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public class DituVO  implements Serializable {
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
