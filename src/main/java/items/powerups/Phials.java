package items.powerups;

import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;
import items.PowerUps;

public class Phials extends PowerUps {

    private int lightIncrease;

    public Phials(String name, String description, ItemType type, int stockPrice, int sellPrice, ItemElement element, int lightIncrease) {
        super(name, description, type, stockPrice, sellPrice, element);
        this.lightIncrease = lightIncrease;
    }

    public int getLightIncrease() {
        return lightIncrease;
    }

    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }

    @Override
    public String characterSays() {
        return "We'll defeat the Dark Lord yet!";
    }
}
