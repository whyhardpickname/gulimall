package com.atguigu.gulimall.product;

import com.atguigu.common.to.MemberPrice;
import com.atguigu.common.to.SkuReductionTo;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;

import com.atguigu.gulimall.product.vo.Skus;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootTest
class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Autowired
	CategoryService categoryService;

	@Test
	void testBeanUtils() {
		Skus skus = new Skus();
		ArrayList<MemberPrice> memberPrices = new ArrayList<>();
		MemberPrice memberPrice = new MemberPrice();
		memberPrice.setId(1L);
		memberPrice.setName("name");
		memberPrice.setPrice(new BigDecimal(1.0));
		memberPrices.add(memberPrice);
		skus.setMemberPrice(memberPrices);
		SkuReductionTo skuReductionTo = new SkuReductionTo();
		BeanUtils.copyProperties(skus, skuReductionTo);
		System.out.println(skuReductionTo.getMemberPrice().get(0));
	}

	@Test
	void findPathTest() {
		Long[] catelogPath = categoryService.findCatelogPath(227L);
		log.info("path: {}", Arrays.asList(catelogPath));
	}

	@Test
	void contextLoads() {

		BrandEntity brandEntity = new BrandEntity();

		brandEntity.setName("小米");
		brandService.save(brandEntity);
		System.out.println("save success.");
	}

	@Test
	void queryTest() {
		List<BrandEntity> brandEntities = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		brandEntities.forEach(System.out::println);
	}

}
