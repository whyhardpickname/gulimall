package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author markchern
 * @email 13zxchen3@gmail.com
 * @date 2021-10-05 07:06:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
