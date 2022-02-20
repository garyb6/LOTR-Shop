package items;

import behaviours.ISell;
import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;

public abstract class Armour extends Items implements ISell {

    private int defence;
    private ItemElement element;
    private int bodySlot;
    protected Armour(String name, String description, ItemType type, int stockPrice, int sellPrice, int defence, ItemElement element, int bodySlot) {
        super(name, description, type, stockPrice, sellPrice);
        this.defence = defence;
        this.element = element;
        this.bodySlot = bodySlot;
    }

    public int getDefence() {
        return defence;
    }

    public ItemElement getElement() {
        return element;
    }

    public int getBodySlot() {
        return bodySlot;
    }

}
