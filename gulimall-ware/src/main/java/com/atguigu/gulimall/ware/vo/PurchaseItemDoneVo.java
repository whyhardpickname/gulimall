package com.atguigu.gulimall.ware.vo;

import lombok.Data;

/**
 * @author MarkChern
 * @create 11/24/2021 3:19 PM
 */
@Data
public class PurchaseItemDoneVo {
    private Long itemId;
    private Integer status;
    private String reason;
}
