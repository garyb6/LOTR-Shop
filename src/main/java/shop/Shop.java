package shop;

import behaviours.ISell;

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
}
