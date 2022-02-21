package shop.items.medicine;

import shop.items.ENUMs.Cure;
import shop.items.ENUMs.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AthelasTest {

    Athelas athelas;

    @Before
    public void setUp(){
        athelas = new Athelas("Fresh Athelas", "Revives Character",
                ItemType.Healing, 50, 150, Cure.Revive, "Athelas reignites the Light within you");
    }

    @Test
    public void canGetStockPrice() {
        assertEquals(50, athelas.getStockPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(150, athelas.getSellPrice());
    }

    @Test
    public void canGetStatusHeal() {
        assertEquals("Athelas reignites the Light within you", athelas.getStatusHeal());
    }

    @Test
    public void canSeeWhatCharacterSays() {
        assertEquals("I felt life in me again", athelas.characterSays());
    }

    @Test
    public void calculateMarkUp() {
        assertEquals(100, athelas.calculateMarkUp());
    }
}