package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MarkChern
 * @create 10/6/2021 2:17 PM
 */
@FeignClient(value = "gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping(value = "/coupon/coupon/member/list")
    public R membercoupons();
}
