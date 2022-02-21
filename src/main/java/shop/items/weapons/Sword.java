package shop.items.weapons;

import shop.items.ENUMs.ItemElement;
import shop.items.ENUMs.ItemType;
import shop.items.Weapons;

public class Sword extends Weapons {
    public Sword(String name, String description, ItemType type, int stockPrice, int sellPrice, int attack, ItemElement element, boolean twoHandWield) {
        super(name, description, type, stockPrice, sellPrice, attack, element, twoHandWield);
    }
    @Override
    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }

}
