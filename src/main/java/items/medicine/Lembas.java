package items.medicine;

import items.ENUMs.Cure;
import items.ENUMs.ItemType;
import items.Medicine;

public class Lembas extends Medicine {

    private int hpIncrease;

    public Lembas(String name, String description, ItemType type, int stockPrice, int sellPrice, Cure cure, int hpIncrease) {
        super(name, description, type, stockPrice, sellPrice, cure);
        this.hpIncrease = hpIncrease;
    }

    public int getHpIncrease() {
        return hpIncrease;
    }

    @Override
    public String characterSays() {
        return "One small bite will fill the stomach of a grown man";
    }

    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }
}
