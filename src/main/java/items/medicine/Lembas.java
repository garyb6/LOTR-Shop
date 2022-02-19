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

    public void setHpIncrease(int hpIncrease) {
        this.hpIncrease = hpIncrease;
    }

    @Override
    public String characterSays() {
        return "That's much better!";
    }

    @Override
    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }
}
