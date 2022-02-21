package shop.items.weapons;

import shop.items.ENUMs.ItemElement;
import shop.items.ENUMs.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {

    Axe axe;

    @Before
    public void setUp(){
        axe = new Axe("Gimli's Axe", "The Uruk Hai stood no chance", ItemType.Attack, 250, 750,
                50, ItemElement.Light, false);
    }

    @Test
    public void canGetItemType(){
        assertEquals(ItemType.Attack, axe.getType());
    }

    @Test
    public void canGetItemElement(){
        assertEquals(ItemElement.Light, axe.getElement());
    }

    @Test
    public void canGetStockPrice(){
        assertEquals(250, axe.getStockPrice());
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(750, axe.getSellPrice());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(500, axe.calculateMarkUp());
    }
}