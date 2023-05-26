package com.kejeiri.java.course.Controller;

import com.kejeiri.java.course.interfaces.DiscountStrategy;

public class ApplyDiscount {

    DiscountStrategy discountStrategy;

    public ApplyDiscount(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void getDiscount() {
        discountStrategy.giveDiscount();
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
