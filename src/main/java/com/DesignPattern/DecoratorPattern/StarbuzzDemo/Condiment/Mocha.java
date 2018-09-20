package com.DesignPattern.DecoratorPattern.StarbuzzDemo.Condiment;

import com.DesignPattern.DecoratorPattern.StarbuzzDemo.base.Beverage;
import com.DesignPattern.DecoratorPattern.StarbuzzDemo.base.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
