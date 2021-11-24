package com.atguigu.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @author MarkChern
 * @create 11/21/2021 2:07 PM
 */
@Data
public class MergeVo {
    private Long purchaseId; //整单id
    private List<Long> items; //合并项集合
}
