package com.DesignPattern.FactoryPattern.PizzaDemo2.factory;

import com.DesignPattern.FactoryPattern.PizzaDemo2.base.PizzaIngredientFactory;
import com.DesignPattern.FactoryPattern.PizzaDemo2.base.ingredients.*;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.Pepperoni.SlicedPepperoni;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.cheese.MozzarellaCheese;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.clams.FrozenClams;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.dough.ThinCrustDough;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.sauce.PlumTomatoSauce;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.veggies.BlackOlives;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.veggies.Eggplant;
import com.DesignPattern.FactoryPattern.PizzaDemo2.ingredients.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public String getStyle() {
        return "Chicago Style";
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
