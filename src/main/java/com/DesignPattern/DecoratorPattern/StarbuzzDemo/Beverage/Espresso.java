package com.DesignPattern.DecoratorPattern.StarbuzzDemo.Beverage;

import com.DesignPattern.DecoratorPattern.StarbuzzDemo.base.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
