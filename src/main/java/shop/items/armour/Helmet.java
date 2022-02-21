package shop.items.armour;

import shop.items.Armour;
import shop.items.ENUMs.ItemElement;
import shop.items.ENUMs.ItemType;

public class Helmet extends Armour {
    public Helmet(String name, String description, ItemType type, int stockPrice, int sellPrice, int defence, ItemElement element, int bodySlot) {
        super(name, description, type, stockPrice, sellPrice, defence, element, bodySlot);
    }

    @Override
    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }
}
