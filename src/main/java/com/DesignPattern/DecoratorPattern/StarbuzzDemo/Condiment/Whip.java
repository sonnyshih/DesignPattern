package com.DesignPattern.DecoratorPattern.StarbuzzDemo.Condiment;

import com.DesignPattern.DecoratorPattern.StarbuzzDemo.base.Beverage;
import com.DesignPattern.DecoratorPattern.StarbuzzDemo.base.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }
}
