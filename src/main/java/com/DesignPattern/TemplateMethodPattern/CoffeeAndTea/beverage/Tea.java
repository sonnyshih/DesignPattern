package com.DesignPattern.TemplateMethodPattern.CoffeeAndTea.beverage;

import com.DesignPattern.TemplateMethodPattern.CoffeeAndTea.base.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
