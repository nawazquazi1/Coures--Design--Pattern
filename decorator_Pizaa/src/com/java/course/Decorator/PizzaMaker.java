package com.java.course.Decorator;

import com.java.course.InterFace.Pizza;
import com.java.course.pizzaModel.Mozzarella;
import com.java.course.pizzaModel.PlainPizza;
import com.java.course.pizzaModel.TomatoSauce;

public class PizzaMaker {
    public static void main(String[] args){
        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());

    }
}
