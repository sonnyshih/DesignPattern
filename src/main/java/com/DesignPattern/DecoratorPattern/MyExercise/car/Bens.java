package com.DesignPattern.DecoratorPattern.MyExercise.car;

import com.DesignPattern.DecoratorPattern.MyExercise.base.Matrial;

public class Bens extends Matrial {

    public Bens(){
        description = "Bens Car";
    }

    @Override
    public double cost() {
        return 1600;
    }
}
