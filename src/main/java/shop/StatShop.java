package shop;

import behaviours.ITalk;

import java.util.ArrayList;

public class StatShop {

    private String name;
    private ArrayList<ITalk> medItems;

    public StatShop(String name) {
        this.name = name;
        this.medItems = new ArrayList<ITalk>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ITalk> getMedItems() {
        return medItems;
    }

    public void setMedItems(ArrayList<ITalk> medItems) {
        this.medItems = medItems;
    }

    public void addItem(ITalk item) {
        this.medItems.add(item);
    }

    public void removeItem(ITalk item) {
        this.medItems.remove(item);
    }

    public int checkStockNumber() {
        return this.medItems.size();
    }
}
