package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @author MarkChern
 * @create 11/6/2021 2:50 PM
 */
@Data
public class AttrRespVo extends AttrVo {

    private String catelogName;

    private String groupName;

    private Long[] catelogPath;
}
