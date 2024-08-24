package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 监测数据
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
@TableName("jianceshuju")
public class JianceshujuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianceshujuEntity() {
		
	}
	
	public JianceshujuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 方位编号
	 */
					
	private String fangweibianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：方位编号
	 */
	public void setFangweibianhao(String fangweibianhao) {
		this.fangweibianhao = fangweibianhao;
	}
	/**
	 * 获取：方位编号
	 */
	public String getFangweibianhao() {
		return fangweibianhao;
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
