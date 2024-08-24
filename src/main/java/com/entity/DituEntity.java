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
 * 地图
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
@TableName("ditu")
public class DituEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DituEntity() {
		
	}
	
	public DituEntity(T t) {
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
	 * 地区
	 */
					
	private String name;
	
	/**
	 * 数量
	 */
					
	private Integer value;
	
	
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
	 * 设置：地区
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：地区
	 */
	public String getName() {
		return name;
	}
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
