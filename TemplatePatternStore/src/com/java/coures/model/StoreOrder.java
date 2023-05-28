package com.java.coures.model;

import com.java.coures.template.OrderProcessTemplate;

public class StoreOrder extends OrderProcessTemplate {

    @Override
    protected void selectProduct() {
        System.out.println("Selecting Product on Store ");
    }

    @Override
    protected void makePayment() {
        System.out.println("Making Cash/card Payment at Store");
    }

    @Override
    protected void deliverProduct() {
        System.out.println("Product Delivered to Customer");
    }
}
