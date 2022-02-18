package items;

import items.ENUMs.ItemType;

import java.lang.annotation.ElementType;

public abstract class Armour extends Items {

    private int defence;
    private ElementType element;
    private int bodySlot;
    protected Armour(String name, String description, ItemType type, int stockPrice, int sellPrice, int defence, ElementType element, int bodySlot) {
        super(name, description, type, stockPrice, sellPrice);
        this.defence = defence;
        this.element = element;
        this.bodySlot = bodySlot;
    }
}
