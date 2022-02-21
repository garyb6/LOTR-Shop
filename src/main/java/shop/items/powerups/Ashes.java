package shop.items.powerups;

import shop.items.ENUMs.ItemElement;
import shop.items.ENUMs.ItemType;
import shop.items.PowerUps;

public class Ashes extends PowerUps {

    private int shadowIncrease;

    public Ashes(String name, String description, ItemType type, int stockPrice, int sellPrice, ItemElement element, int shadowIncrease) {
        super(name, description, type, stockPrice, sellPrice, element);
        this.shadowIncrease = shadowIncrease;

    }

    public int getShadowIncrease() {
        return shadowIncrease;
    }

    @Override
    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }

    @Override
    public String characterSays() {
        return "We'll get those stinkin' hobbits now!";
    }
}
