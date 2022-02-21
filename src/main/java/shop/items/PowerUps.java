package shop.items;

import behaviours.ISell;
import behaviours.ITalk;
import shop.items.ENUMs.ItemElement;
import shop.items.ENUMs.ItemType;

public abstract class PowerUps extends Items implements ITalk, ISell {

    private ItemElement element;

    public PowerUps(String name, String description, ItemType type, int stockPrice, int sellPrice, ItemElement element) {
        super(name, description, type, stockPrice, sellPrice);
        this.element = element;
    }

    public ItemElement getElement() {
        return element;
    }
}
