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

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public int calculateGrossProfit() {
        int total = 0;
//        for (ISell item : this.stock){
//            total += item.calculateMarkUp();
//        }
        for (int i = 0; i < this.stock.size(); i++){
            total += this.stock.get(i).calculateMarkUp();
        }
        return total;
    }
}


