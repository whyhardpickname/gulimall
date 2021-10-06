package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author markchern
 * @email 13zxchen3@gmail.com
 * @date 2021-10-05 13:54:17
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
