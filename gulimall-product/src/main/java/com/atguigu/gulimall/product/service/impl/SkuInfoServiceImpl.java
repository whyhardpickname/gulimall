package com.atguigu.gulimall.product.service.impl;

import com.atguigu.gulimall.product.entity.SpuInfoEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.SkuInfoDao;
import com.atguigu.gulimall.product.entity.SkuInfoEntity;
import com.atguigu.gulimall.product.service.SkuInfoService;
import org.springframework.util.ObjectUtils;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                new QueryWrapper<SkuInfoEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void saveSkuInfo(SkuInfoEntity skuInfoEntity) {
        this.baseMapper.insert(skuInfoEntity);
    }

    @Override
    public PageUtils queryPageByCondition(Map<String, Object> params) {
        QueryWrapper<SkuInfoEntity> skuInfoEntityQueryWrapper = new QueryWrapper<>();
        String key = (String) params.get("key");
        if (!ObjectUtils.isEmpty(key)) {
            skuInfoEntityQueryWrapper.and(queryWrapper -> {
                queryWrapper.eq("sku_id", key).or().like("sku_name", key);
            });
        }
        String min = (String) params.get("min");
        if (!ObjectUtils.isEmpty(min)) {
            skuInfoEntityQueryWrapper.ge("price", min);
        }
        String max = (String) params.get("max");
        if (!ObjectUtils.isEmpty(max)) {
            try {
                BigDecimal bigDecimal = new BigDecimal(max);
                if (bigDecimal.compareTo(BigDecimal.ZERO) == 1) {
                    skuInfoEntityQueryWrapper.le("price", max);
                }
            } catch (Exception e) {

            }
        }
        String brandId = (String) params.get("brandId");
        if (!ObjectUtils.isEmpty(brandId) && !"0".equals(brandId)) {
            skuInfoEntityQueryWrapper.eq("brand_id", brandId);
        }
        String catelogId = (String) params.get("catelogId");
        if (!ObjectUtils.isEmpty(catelogId) && !"0".equals(catelogId)) {
            skuInfoEntityQueryWrapper.eq("catalog_id", catelogId);
        }


        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params), skuInfoEntityQueryWrapper);

        return new PageUtils(page);
    }

}