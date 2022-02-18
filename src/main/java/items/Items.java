package items;

import items.ENUMs.ItemType;

public abstract class Items {

    private String name;
    private String description;
    private ItemType type;
    private int stockPrice;
    private int sellPrice;

    protected Items(String name, String description, ItemType type, int stockPrice, int sellPrice) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.stockPrice = stockPrice;
        this.sellPrice = sellPrice;
    }
}
