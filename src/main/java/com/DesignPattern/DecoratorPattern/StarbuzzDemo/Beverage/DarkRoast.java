package com.DesignPattern.DecoratorPattern.StarbuzzDemo.Beverage;

import com.DesignPattern.DecoratorPattern.StarbuzzDemo.base.Beverage;
import com.sun.org.apache.xpath.internal.operations.Bool;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
