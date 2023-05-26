package com.kejeiri.java.course.model;

import com.kejeiri.java.course.interfaces.DiscountStrategy;

public class FlatDiscount implements DiscountStrategy {
    @Override
    public void giveDiscount() {
        System.out.println("Flat Discount");
    }
}
