package com.kejeiri.java.course.model;

import com.kejeiri.java.course.interfaces.DiscountStrategy;

public class CouponDiscount implements DiscountStrategy {

    @Override
    public void giveDiscount() {
        System.out.println("Coupon Discount");
    }
}
