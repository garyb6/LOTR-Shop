package items;

import behaviours.ITalk;

public abstract class PowerUps extends Items implements ITalk {
    public PowerUps() {
        super(name, description, type, stockPrice, sellPrice);
    }
}
