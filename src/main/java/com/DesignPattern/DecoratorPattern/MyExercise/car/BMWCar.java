package com.DesignPattern.DecoratorPattern.MyExercise.car;

import com.DesignPattern.DecoratorPattern.MyExercise.base.Matrial;

public class BMWCar extends Matrial {

    public BMWCar(){
        description = "BMW Car";
    }

    @Override
    public double cost() {
        return 1500;
    }
}
