package com.java.coures;

import com.java.coures.model.OnlineOrder;
import com.java.coures.model.StoreOrder;

public class Main {
    public static void main(String[] args) {
        StoreOrder storeOrder=new StoreOrder();
        storeOrder.processOrder();


        OnlineOrder onlineOrder=new OnlineOrder();
        onlineOrder.isGiftWrap=true;
        onlineOrder.processOrder();
    }
}
