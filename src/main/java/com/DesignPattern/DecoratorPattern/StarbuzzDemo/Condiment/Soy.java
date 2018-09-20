package com.DesignPattern.DecoratorPattern.StarbuzzDemo.Condiment;

import com.DesignPattern.DecoratorPattern.StarbuzzDemo.base.Beverage;
import com.DesignPattern.DecoratorPattern.StarbuzzDemo.base.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
