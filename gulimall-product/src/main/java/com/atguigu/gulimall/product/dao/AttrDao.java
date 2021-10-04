package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author markchern
 * @email 13zxchen3@gmail.com
 * @date 2021-10-05 07:06:35
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
