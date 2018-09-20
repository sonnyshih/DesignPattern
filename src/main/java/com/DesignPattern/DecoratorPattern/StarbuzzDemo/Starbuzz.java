package com.DesignPattern.DecoratorPattern.StarbuzzDemo;

import com.DesignPattern.DecoratorPattern.StarbuzzDemo.Beverage.DarkRoast;
import com.DesignPattern.DecoratorPattern.StarbuzzDemo.Beverage.Espresso;
import com.DesignPattern.DecoratorPattern.StarbuzzDemo.Beverage.HouseBlend;
import com.DesignPattern.DecoratorPattern.StarbuzzDemo.Condiment.Mocha;
import com.DesignPattern.DecoratorPattern.StarbuzzDemo.Condiment.Soy;
import com.DesignPattern.DecoratorPattern.StarbuzzDemo.Condiment.Whip;
import com.DesignPattern.DecoratorPattern.StarbuzzDemo.base.Beverage;

public class Starbuzz {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseRoast = new HouseBlend();
        houseRoast = new Soy(houseRoast);
        houseRoast = new Mocha(houseRoast);
        houseRoast = new Whip(houseRoast);
        System.out.println(houseRoast.getDescription() + " $" + houseRoast.cost());
    }
}
