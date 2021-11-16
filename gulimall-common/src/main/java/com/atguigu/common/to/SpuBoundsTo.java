package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author MarkChern
 * @create 11/16/2021 2:43 PM
 */
@Data
public class SpuBoundsTo {

    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}
