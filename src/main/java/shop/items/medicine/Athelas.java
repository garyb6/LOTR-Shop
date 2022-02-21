package shop.items.medicine;

import shop.items.ENUMs.Cure;
import shop.items.ENUMs.ItemType;
import shop.items.Medicine;

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

    @Override
    public int calculateMarkUp() {
        return getSellPrice() - getStockPrice();
    }
}
