package items;

import behaviours.ITalk;

public abstract class Medicine extends Items implements ITalk {
    public Medicine() {
        super(name, description, type, stockPrice, sellPrice);
    }
}
