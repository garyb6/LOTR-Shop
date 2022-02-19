package items;

import behaviours.ISell;
import behaviours.ITalk;
import items.ENUMs.Cure;
import items.ENUMs.ItemType;

public abstract class Medicine extends Items implements ITalk, ISell {

    private Cure cure;
    public Medicine(String name, String description, ItemType type, int stockPrice, int sellPrice, Cure cure) {
        super(name, description, type, stockPrice, sellPrice);
        this.cure = cure;
    }
}
