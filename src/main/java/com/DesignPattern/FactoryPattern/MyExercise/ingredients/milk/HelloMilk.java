package com.DesignPattern.FactoryPattern.MyExercise.ingredients.milk;

import com.DesignPattern.FactoryPattern.MyExercise.base.ingredients.Milk;

public class HelloMilk implements Milk {
    @Override
    public String getName() {
        return "Hello Milk";
    }
}
