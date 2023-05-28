package com.java.course.core;

public abstract class Phone {

    protected String brand;
    protected String modelName;
     protected String bodyType;
   protected   String phoneSize;

    public void buildPhone(){
        System.out.println("Building Phone Of Brand :"+brand);
        System.out.println("Phone Model is : "+modelName);
        System.out.println("Phone Size is : "+phoneSize);
        System.out.println("Body Type Phone is :"+bodyType);
    }
    public void assemblePhone(){
        System.out.println("Assembling all Parts Of Phone");
    }
    public void packPhoneInBox(){
        System.out.println("Packing Of Phone");
    }
}
