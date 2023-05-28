package com.java.course.pizzaModel;
// Implements the Pizza interface with only the required
// methods from the interface

// Every Pizza made will start as a PlainPizza

import com.java.course.InterFace.Pizza;

public class PlainPizza implements Pizza {

    public String getDescription() {
        return "Thin dough";
    }

    public double getCost() {
        System.out.println("Cost of Dough: " + 4.00);
        return 4.00;
    }

}