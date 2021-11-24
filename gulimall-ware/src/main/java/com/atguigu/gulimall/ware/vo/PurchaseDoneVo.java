package com.atguigu.gulimall.ware.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author MarkChern
 * @create 11/24/2021 3:18 PM
 */
@Data
public class PurchaseDoneVo {

    @NotNull
    private  Long id;
    private List<PurchaseItemDoneVo> items;
}
