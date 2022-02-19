package items.powerups;

import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;
import items.PowerUps;

public class Phials extends PowerUps {

    public Phials(String name, String description, ItemType type, int stockPrice, int sellPrice, ItemElement element) {
        super(name, description, type, stockPrice, sellPrice, element);
    }

    @Override
    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }

    @Override
    public String characterSays() {
        return "We'll defeat the Dark Lord yet!";
    }
}
