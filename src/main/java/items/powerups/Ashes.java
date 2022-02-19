package items.powerups;

import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;
import items.PowerUps;

public class Ashes extends PowerUps {

    public Ashes(String name, String description, ItemType type, int stockPrice, int sellPrice, ItemElement element) {
        super(name, description, type, stockPrice, sellPrice, element);

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
