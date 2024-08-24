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
 * 监测车辆
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-14 20:39:11
 */
@TableName("jiancecheliang")
public class JiancecheliangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiancecheliangEntity() {
		
	}
	
	public JiancecheliangEntity(T t) {
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
