package shop;

import behaviours.ISell;
import items.weapons.Axe;

import java.util.ArrayList;

public class Shop{

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList <ISell>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int checkStockNumber() {
        return this.stock.size();
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }
}
