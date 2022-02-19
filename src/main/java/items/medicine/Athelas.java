package items.medicine;

import items.Medicine;

public class Athelas extends Medicine {
    @Override
    public String characterSays() {
        return null;
    }

    @Override
    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }
}
