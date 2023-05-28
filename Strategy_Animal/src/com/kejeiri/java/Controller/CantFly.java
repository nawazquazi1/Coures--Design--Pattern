package com.kejeiri.java.Controller;

//Class used if the Animal can't fly

import com.kejeiri.java.course.Flys;

public class CantFly implements Flys {

    public String fly() {
        return "I can't fly";
    }

}