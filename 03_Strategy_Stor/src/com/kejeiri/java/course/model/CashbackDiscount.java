package com.kejeiri.java.course.model;

import com.kejeiri.java.course.interfaces.DiscountStrategy;

public class CashbackDiscount implements DiscountStrategy {
    @Override
    public void giveDiscount() {
        System.out.println("CashBack Discount");
    }
}
