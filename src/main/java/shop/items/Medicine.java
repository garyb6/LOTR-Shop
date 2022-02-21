package shop.items;

import behaviours.ISell;
import behaviours.ITalk;
import shop.items.ENUMs.Cure;
import shop.items.ENUMs.ItemType;

public abstract class Medicine extends Items implements ITalk, ISell {

    private Cure cure;
    public Medicine(String name, String description, ItemType type, int stockPrice, int sellPrice, Cure cure) {
        super(name, description, type, stockPrice, sellPrice);
        this.cure = cure;
    }

    public Cure getCure() {
        return cure;
    }
}
