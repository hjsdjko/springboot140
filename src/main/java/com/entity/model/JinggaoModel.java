package com.entity.model;

import com.entity.JinggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 警告
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public class JinggaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 小车编号
	 */
	
	private String xiaochebianhao;
		
	/**
	 * 时间编号
	 */
	
	private String shijianbianhao;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
				
	
	/**
	 * 设置：小车编号
	 */
	 
	public void setXiaochebianhao(String xiaochebianhao) {
		this.xiaochebianhao = xiaochebianhao;
	}
	
	/**
	 * 获取：小车编号
	 */
	public String getXiaochebianhao() {
		return xiaochebianhao;
	}
				
	
	/**
	 * 设置：时间编号
	 */
	 
	public void setShijianbianhao(String shijianbianhao) {
		this.shijianbianhao = shijianbianhao;
	}
	
	/**
	 * 获取：时间编号
	 */
	public String getShijianbianhao() {
		return shijianbianhao;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
			
}
