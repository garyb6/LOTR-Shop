package items.medicine;

import items.ENUMs.Cure;
import items.ENUMs.ItemType;
import items.Medicine;

public class Athelas extends Medicine {
    public Athelas(String name, String description, ItemType type, int stockPrice, int sellPrice, Cure cure) {
        super(name, description, type, stockPrice, sellPrice, cure);
    }

    @Override
    public String characterSays() {
        return null;
    }

    @Override
    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }
}
