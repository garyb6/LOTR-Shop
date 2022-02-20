package items.weapons;

import behaviours.ISell;
import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;
import items.Weapons;

public class Sword extends Weapons {
    public Sword(String name, String description, ItemType type, int stockPrice, int sellPrice, int attack, ItemElement element, boolean twoHandWield) {
        super(name, description, type, stockPrice, sellPrice, attack, element, twoHandWield);
    }

    @Override
    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }

}
