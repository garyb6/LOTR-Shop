package items.medicine;

import items.ENUMs.Cure;
import items.ENUMs.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LembasTest {

    Lembas lembas;

    @Before
    public void setUp() {
        lembas = new Lembas("Quarter Lembas Loaf", "Increase Health a little", ItemType.Healing, 5, 15,
                Cure.Health, 25);
    }

    @Test
    public void canGetCureType(){
        assertEquals(Cure.Health, lembas.getCure());
    }

    @Test
    public void canGetStockPrice() {
        assertEquals(5, lembas.getStockPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(15, lembas.getSellPrice());
    }

    @Test
    public void canGetHpIncrease() {
        assertEquals(25, lembas.getHpIncrease());
    }

    @Test
    public void characterSays() {
        assertEquals("One small bite will fill the stomach of a grown man", lembas.characterSays());
    }

    @Test
    public void calculateMarkUp() {
        assertEquals(10, lembas.calculateMarkUp());
    }
}