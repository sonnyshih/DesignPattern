package com.DesignPattern.FactoryPattern.PizzaDemo2.store;

import com.DesignPattern.FactoryPattern.PizzaDemo2.base.Pizza;
import com.DesignPattern.FactoryPattern.PizzaDemo2.base.PizzaIngredientFactory;
import com.DesignPattern.FactoryPattern.PizzaDemo2.base.PizzaStore;
import com.DesignPattern.FactoryPattern.PizzaDemo2.factory.ChicagoPizzaIngredientFactory;
import com.DesignPattern.FactoryPattern.PizzaDemo2.pizza.CheesePizza;
import com.DesignPattern.FactoryPattern.PizzaDemo2.pizza.ClamPizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    private PizzaIngredientFactory ingredientFactory;

    public ChicagoStylePizzaStore(){
        ingredientFactory = new ChicagoPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CheesePizza(ingredientFactory);

            case "veggie":
                return null;

            case "clam":
                return new ClamPizza(ingredientFactory);

            case "pepperoni":
                return null;
        }

        return null;
    }
}
