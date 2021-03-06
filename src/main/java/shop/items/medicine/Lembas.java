package shop.items.medicine;

import shop.items.ENUMs.Cure;
import shop.items.ENUMs.ItemType;
import shop.items.Medicine;

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

    @Override
    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }
}
