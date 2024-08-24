package com.entity.model;

import com.entity.JianceshebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 监测设备
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public class JianceshebeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 云端连接
	 */
	
	private String yunduanlianjie;
		
	/**
	 * 监测时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianceshijian;
		
	/**
	 * 编号备注
	 */
	
	private String bianhaobeizhu;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 经度
	 */
	
	private Double longitude;
		
	/**
	 * 纬度
	 */
	
	private Double latitude;
		
	/**
	 * 地址
	 */
	
	private String fulladdress;
				
	
	/**
	 * 设置：云端连接
	 */
	 
	public void setYunduanlianjie(String yunduanlianjie) {
		this.yunduanlianjie = yunduanlianjie;
	}
	
	/**
	 * 获取：云端连接
	 */
	public String getYunduanlianjie() {
		return yunduanlianjie;
	}
				
	
	/**
	 * 设置：监测时间
	 */
	 
	public void setJianceshijian(Date jianceshijian) {
		this.jianceshijian = jianceshijian;
	}
	
	/**
	 * 获取：监测时间
	 */
	public Date getJianceshijian() {
		return jianceshijian;
	}
				
	
	/**
	 * 设置：编号备注
	 */
	 
	public void setBianhaobeizhu(String bianhaobeizhu) {
		this.bianhaobeizhu = bianhaobeizhu;
	}
	
	/**
	 * 获取：编号备注
	 */
	public String getBianhaobeizhu() {
		return bianhaobeizhu;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：经度
	 */
	 
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * 获取：经度
	 */
	public Double getLongitude() {
		return longitude;
	}
				
	
	/**
	 * 设置：纬度
	 */
	 
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * 获取：纬度
	 */
	public Double getLatitude() {
		return latitude;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}
			
}
