package items;

public abstract class Items {

    private String name;
    private String description;
    private Enum Type;
    private int stockPrice;
    private int sellPrice;

    protected Items(String name, String description, Enum type, int stockPrice, int sellPrice) {
        this.name = name;
        this.description = description;
        Type = type;
        this.stockPrice = stockPrice;
        this.sellPrice = sellPrice;
    }
}
