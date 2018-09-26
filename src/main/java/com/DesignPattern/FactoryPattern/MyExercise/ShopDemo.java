package com.DesignPattern.FactoryPattern.MyExercise;

import com.DesignPattern.FactoryPattern.MyExercise.store.JapanBeverageStore;
import com.DesignPattern.FactoryPattern.MyExercise.store.TaiwanBeverageStore;

public class ShopDemo {
    public static void main(String[] args) {
        TaiwanBeverageStore taiwanBeverageStore = new TaiwanBeverageStore();
        taiwanBeverageStore.orderBeverage("milk tea");

        System.out.println("");

        JapanBeverageStore japanBeverageStore = new JapanBeverageStore();
        japanBeverageStore.orderBeverage("sugar tea");
    }
}
