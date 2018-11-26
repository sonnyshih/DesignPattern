package com.DesignPattern.CompositePattern.MenuDemo.base;

import java.util.Iterator;

public abstract class MenuComponent {

    /* ##### Menu (Start) ##### */
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    /* ##### Menu (End) ##### */

    /* ##### Menu Item (Start) ##### */
    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
    /* ##### Menu Item (Start) ##### */

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}
