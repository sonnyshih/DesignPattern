package com.DesignPattern.FactoryPattern.PizzaDemo2.factory;

import com.DesignPattern.FactoryPattern.PizzaDemo2.base.PizzaIngredientFactory;
import com.DesignPattern.FactoryPattern.PizzaDemo2.base.ingredients.*;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.Pepperoni.SlicedPepperoni;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.cheese.ReggianoCheese;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.clams.FreshClams;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.dough.ThinCrustDough;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.sauce.MarinaraSauce;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.veggies.Garlic;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.veggies.Mushroom;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.veggies.Onion;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public String getStyle() {
        return "New York Style";
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[]= { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
