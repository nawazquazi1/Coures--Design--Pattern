package com.java.coures.template;

public abstract class OrderProcessTemplate {
    public boolean isGiftWrap;

    protected abstract void selectProduct();

    protected abstract void makePayment();

    protected final void packProduct() {
        if (isGiftWrap) {
            System.out.println("Gift Wrapping Product");
        } else {
            System.out.println("Simply Packed Product");
        }
    }


    protected abstract void deliverProduct();

    public final void processOrder() {
        selectProduct();
        makePayment();
        packProduct();
        deliverProduct();
    }
}
