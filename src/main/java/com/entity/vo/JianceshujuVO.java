package com.entity.vo;

import com.entity.JianceshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 监测数据
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public class JianceshujuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 最大速度（km/h）
	 */
	
	private Integer zuidasudu;
		
	/**
	 * 最大等待时长(s)
	 */
	
	private Integer zuidadengdaishizhang;
				
	
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
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：最大速度（km/h）
	 */
	 
	public void setZuidasudu(Integer zuidasudu) {
		this.zuidasudu = zuidasudu;
	}
	
	/**
	 * 获取：最大速度（km/h）
	 */
	public Integer getZuidasudu() {
		return zuidasudu;
	}
				
	
	/**
	 * 设置：最大等待时长(s)
	 */
	 
	public void setZuidadengdaishizhang(Integer zuidadengdaishizhang) {
		this.zuidadengdaishizhang = zuidadengdaishizhang;
	}
	
	/**
	 * 获取：最大等待时长(s)
	 */
	public Integer getZuidadengdaishizhang() {
		return zuidadengdaishizhang;
	}
			
}
