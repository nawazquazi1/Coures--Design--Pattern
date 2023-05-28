package com.java.coures.model;

import com.java.coures.template.OrderProcessTemplate;

public class OnlineOrder extends OrderProcessTemplate {
    @Override
    protected void selectProduct() {
        System.out.println("Selecting Product And Adding  to Cart ");
    }

    @Override
    protected void makePayment() {
        System.out.println("Making COd Or Online Payment at  App");
    }

    @Override
    protected void deliverProduct() {
        System.out.println("Product Dispatched");
    }
}
