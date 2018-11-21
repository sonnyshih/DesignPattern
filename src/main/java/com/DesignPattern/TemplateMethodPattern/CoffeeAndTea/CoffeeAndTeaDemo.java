package com.DesignPattern.TemplateMethodPattern.CoffeeAndTea;

import com.DesignPattern.TemplateMethodPattern.CoffeeAndTea.beverage.Coffee;
import com.DesignPattern.TemplateMethodPattern.CoffeeAndTea.beverage.CoffeeWithHook;
import com.DesignPattern.TemplateMethodPattern.CoffeeAndTea.beverage.Tea;
import com.DesignPattern.TemplateMethodPattern.CoffeeAndTea.beverage.TeaWithHook;

/* Template Method Pattern (樣板方法模式) */
public class CoffeeAndTeaDemo {
    public static void main(String[] args) {
        System.out.println("/* ##### Show Caffeine Beverage ##### */");
        showCaffeineBeverage();

        System.out.println("\n/* ##### Show Caffeine Beverage with hook ##### */");
        showCaffeinBeverageWithHook();
    }

    public static void showCaffeineBeverage(){
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("######");

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

    public static void showCaffeinBeverageWithHook(){
        TeaWithHook tea = new TeaWithHook();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        CoffeeWithHook coffee = new CoffeeWithHook();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
