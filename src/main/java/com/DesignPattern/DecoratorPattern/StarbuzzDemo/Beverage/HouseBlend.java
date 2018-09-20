package com.DesignPattern.DecoratorPattern.StarbuzzDemo.Beverage;

import com.DesignPattern.DecoratorPattern.StarbuzzDemo.base.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
