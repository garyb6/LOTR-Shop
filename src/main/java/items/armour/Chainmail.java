package items.armour;

import items.Armour;
import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;

import java.lang.annotation.ElementType;

public class Chainmail extends Armour {
    public Chainmail(String name, String description, ItemType type, int stockPrice, int sellPrice, int defence, ItemElement element, int bodySlot) {
        super(name, description, type, stockPrice, sellPrice, defence, element, bodySlot);
    }

    @Override
    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }
}
