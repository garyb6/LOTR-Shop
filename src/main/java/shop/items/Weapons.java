package shop.items;

import behaviours.ISell;
import shop.items.ENUMs.ItemElement;
import shop.items.ENUMs.ItemType;

public abstract class Weapons extends Items implements ISell {

    private int attack;
    private ItemElement element;
    private boolean twoHandWield;

    protected Weapons(String name, String description, ItemType type, int stockPrice, int sellPrice, int attack, ItemElement element, boolean twoHandWield) {
        super(name, description, type, stockPrice, sellPrice);
        this.attack = attack;
        this.element = element;
        this.twoHandWield = twoHandWield;

    }

    public int getAttack() {
        return attack;
    }

    public ItemElement getElement() {
        return element;
    }

    public boolean isTwoHandWield() {
        return twoHandWield;
    }

}
