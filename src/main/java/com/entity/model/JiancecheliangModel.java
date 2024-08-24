package com.entity.model;

import com.entity.JiancecheliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 监测车辆
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public class JiancecheliangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 名称
	 */
	
	private String mingcheng;
		
	/**
	 * 小车编号
	 */
	
	private Integer xiaochebianhao;
		
	/**
	 * 时间编号
	 */
	
	private Integer shijianbianhao;
		
	/**
	 * 机动车数量(辆)
	 */
	
	private Integer jidongcheshuliang;
		
	/**
	 * 最高车速（km/h）
	 */
	
	private Integer zuigaochesu;
		
	/**
	 * 等待时长(s)
	 */
	
	private Integer dengdaishizhang;
		
	/**
	 * 车型
	 */
	
	private String chexing;
				
	
	/**
	 * 设置：名称
	 */
	 
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
				
	
	/**
	 * 设置：小车编号
	 */
	 
	public void setXiaochebianhao(Integer xiaochebianhao) {
		this.xiaochebianhao = xiaochebianhao;
	}
	
	/**
	 * 获取：小车编号
	 */
	public Integer getXiaochebianhao() {
		return xiaochebianhao;
	}
				
	
	/**
	 * 设置：时间编号
	 */
	 
	public void setShijianbianhao(Integer shijianbianhao) {
		this.shijianbianhao = shijianbianhao;
	}
	
	/**
	 * 获取：时间编号
	 */
	public Integer getShijianbianhao() {
		return shijianbianhao;
	}
				
	
	/**
	 * 设置：机动车数量(辆)
	 */
	 
	public void setJidongcheshuliang(Integer jidongcheshuliang) {
		this.jidongcheshuliang = jidongcheshuliang;
	}
	
	/**
	 * 获取：机动车数量(辆)
	 */
	public Integer getJidongcheshuliang() {
		return jidongcheshuliang;
	}
				
	
	/**
	 * 设置：最高车速（km/h）
	 */
	 
	public void setZuigaochesu(Integer zuigaochesu) {
		this.zuigaochesu = zuigaochesu;
	}
	
	/**
	 * 获取：最高车速（km/h）
	 */
	public Integer getZuigaochesu() {
		return zuigaochesu;
	}
				
	
	/**
	 * 设置：等待时长(s)
	 */
	 
	public void setDengdaishizhang(Integer dengdaishizhang) {
		this.dengdaishizhang = dengdaishizhang;
	}
	
	/**
	 * 获取：等待时长(s)
	 */
	public Integer getDengdaishizhang() {
		return dengdaishizhang;
	}
				
	
	/**
	 * 设置：车型
	 */
	 
	public void setChexing(String chexing) {
		this.chexing = chexing;
	}
	
	/**
	 * 获取：车型
	 */
	public String getChexing() {
		return chexing;
	}
			
}
