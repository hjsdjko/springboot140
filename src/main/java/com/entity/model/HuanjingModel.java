package com.entity.model;

import com.entity.HuanjingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 环境
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
public class HuanjingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 时间编号
	 */
	
	private String shijianbianhao;
		
	/**
	 * 时间段
	 */
	
	private String shijianduan;
		
	/**
	 * 温度（°C）
	 */
	
	private Double wendu;
		
	/**
	 * 光照强度（lux）
	 */
	
	private Double guangzhaoqiangdu;
		
	/**
	 * 湿度（%）
	 */
	
	private Double shidu;
		
	/**
	 * 噪音指标（dB）
	 */
	
	private Double zaoyinzhibiao;
		
	/**
	 * 雨雪量
	 */
	
	private Double yuxueliang;
		
	/**
	 * 空气质量（μg/m³）
	 */
	
	private String kongqizhiliang;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：时间段
	 */
	 
	public void setShijianduan(String shijianduan) {
		this.shijianduan = shijianduan;
	}
	
	/**
	 * 获取：时间段
	 */
	public String getShijianduan() {
		return shijianduan;
	}
				
	
	/**
	 * 设置：温度（°C）
	 */
	 
	public void setWendu(Double wendu) {
		this.wendu = wendu;
	}
	
	/**
	 * 获取：温度（°C）
	 */
	public Double getWendu() {
		return wendu;
	}
				
	
	/**
	 * 设置：光照强度（lux）
	 */
	 
	public void setGuangzhaoqiangdu(Double guangzhaoqiangdu) {
		this.guangzhaoqiangdu = guangzhaoqiangdu;
	}
	
	/**
	 * 获取：光照强度（lux）
	 */
	public Double getGuangzhaoqiangdu() {
		return guangzhaoqiangdu;
	}
				
	
	/**
	 * 设置：湿度（%）
	 */
	 
	public void setShidu(Double shidu) {
		this.shidu = shidu;
	}
	
	/**
	 * 获取：湿度（%）
	 */
	public Double getShidu() {
		return shidu;
	}
				
	
	/**
	 * 设置：噪音指标（dB）
	 */
	 
	public void setZaoyinzhibiao(Double zaoyinzhibiao) {
		this.zaoyinzhibiao = zaoyinzhibiao;
	}
	
	/**
	 * 获取：噪音指标（dB）
	 */
	public Double getZaoyinzhibiao() {
		return zaoyinzhibiao;
	}
				
	
	/**
	 * 设置：雨雪量
	 */
	 
	public void setYuxueliang(Double yuxueliang) {
		this.yuxueliang = yuxueliang;
	}
	
	/**
	 * 获取：雨雪量
	 */
	public Double getYuxueliang() {
		return yuxueliang;
	}
				
	
	/**
	 * 设置：空气质量（μg/m³）
	 */
	 
	public void setKongqizhiliang(String kongqizhiliang) {
		this.kongqizhiliang = kongqizhiliang;
	}
	
	/**
	 * 获取：空气质量（μg/m³）
	 */
	public String getKongqizhiliang() {
		return kongqizhiliang;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
