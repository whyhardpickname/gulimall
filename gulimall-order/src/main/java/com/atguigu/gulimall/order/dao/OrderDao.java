package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author markchern
 * @email 13zxchen3@gmail.com
 * @date 2021-10-05 14:43:10
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
