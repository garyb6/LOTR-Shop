package items.medicine;

import items.ENUMs.Cure;
import items.ENUMs.ItemType;
import items.Medicine;

public class Athelas extends Medicine {

    private String statusHeal;

    public Athelas(String name, String description, ItemType type, int stockPrice, int sellPrice, Cure cure, String statusHeal) {
        super(name, description, type, stockPrice, sellPrice, cure);
        this.statusHeal = statusHeal;
    }

    public String getStatusHeal() {
        return statusHeal;
    }

    @Override
    public String characterSays() {
        return "I felt life in me again";
    }

    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }
}
