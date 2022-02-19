package items.weapons;

import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwordTest {

    Sword sword;

    @Before
    public void setUp() {
        sword = new Sword ("Anduril", "Flame of the West", ItemType.Attack, 250, 1000, 40,
                ItemElement.Light, true);
    }

    @Test
    public void getName() {
        assertEquals("Anduril", sword.getName());
    }

    @Test
    public void getType() {
        assertEquals(ItemType.Attack, sword.getType());
    }

    @Test
    public void getStockPrice() {
        assertEquals(250, sword.getStockPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(1000, sword.getSellPrice());
    }

    @Test
    public void canCheckIfTwoHandWield(){
        assertEquals(true, sword.isTwoHandWield());
    }
}