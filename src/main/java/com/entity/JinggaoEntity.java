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
 * 警告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
@TableName("jinggao")
public class JinggaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JinggaoEntity() {
		
	}
	
	public JinggaoEntity(T t) {
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
