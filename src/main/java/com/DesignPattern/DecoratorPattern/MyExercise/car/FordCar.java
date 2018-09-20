package com.DesignPattern.DecoratorPattern.MyExercise.car;

import com.DesignPattern.DecoratorPattern.MyExercise.base.Matrial;

public class FordCar extends Matrial {

    public FordCar(){
        description = "Ford car";
    }

    @Override
    public double cost() {
        return 500;
    }
}
