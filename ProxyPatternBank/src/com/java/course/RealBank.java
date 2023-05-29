package com.java.course;

public class RealBank implements IBank{
    @Override
    public void withdrawMoney(String clientName) throws Exception {
        System.out.println(clientName + " is withdrawing from ATM...");
    }
}
