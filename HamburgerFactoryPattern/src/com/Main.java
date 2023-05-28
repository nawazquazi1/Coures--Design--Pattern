package com;

import com.Core.JamaicanHambugerFactory;
import com.Core.HamburgerStore;

public class Main {
    public static void main(String[] args) {
        JamaicanHambugerFactory jamaicanHambugerFactory = new JamaicanHambugerFactory();
        HamburgerStore hs = new HamburgerStore(jamaicanHambugerFactory);
        hs.orderHamburger("cheese");
    }
}
