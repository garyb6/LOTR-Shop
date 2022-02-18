package items.weapons;

import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;
import items.Weapons;

public class Axe extends Weapons {
    protected Axe(String name, String description, ItemType type, int stockPrice, int sellPrice, int attack, ItemElement element, boolean twoHandWield) {
        super(name, description, type, stockPrice, sellPrice, attack, element, twoHandWield);
    }

    @Override
    public int calculateMarkUp() {
        return 0;
    }
}
