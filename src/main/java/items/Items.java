package items;

import items.ENUMs.ItemType;

public abstract class Items {

    protected static String name;
    protected static String description;
    protected static ItemType type;
    protected static int stockPrice;
    protected static int sellPrice;

    protected Items(String name, String description, ItemType type, int stockPrice, int sellPrice) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.stockPrice = stockPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
