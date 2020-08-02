package com.kobe.practice.jdk.reflect;

import java.math.BigDecimal;

/**
 * @ClassName: CouponShareActivity
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-05-31 10:55
 */
public class CouponShareActivity extends CouponActivity {

    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
