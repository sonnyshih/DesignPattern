package com.DesignPattern.IteratorPattern.MenuDemo.Iterator;

import com.DesignPattern.IteratorPattern.MenuDemo.base.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList arrayList;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        if (position >= arrayList.size() || arrayList.get(position) == null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) arrayList.get(position);
        position++;
        return menuItem;
    }
}
