package shop.items.weapons;

import shop.items.ENUMs.ItemElement;
import shop.items.ENUMs.ItemType;
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
    public void canGetName() {
        assertEquals("Anduril", sword.getName());
    }

    @Test
    public void canGetItemType() {
        assertEquals(ItemType.Attack, sword.getType());
    }

    @Test
    public void canGetAttackIncreaseAmount(){
        assertEquals(40, sword.getAttack());
    }

    @Test
    public void canCheckStockPrice() {
        assertEquals(250, sword.getStockPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(1000, sword.getSellPrice());
    }

    @Test
    public void canCheckIfTwoHandWield(){
        assertEquals(true, sword.isTwoHandWield());
    }
}