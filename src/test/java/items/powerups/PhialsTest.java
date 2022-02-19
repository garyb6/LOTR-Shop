package items.powerups;

import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhialsTest {

    Phials phials;

    @Before
    public void setUp(){
        phials = new Phials("Phial of Valinor", "The Light of Valinor will lift your heart", ItemType.Powering,
                15, 60, ItemElement.Light, 50);
    }


    @Test
    public void canGetElement(){
        assertEquals(ItemElement.Light, phials.getElement());
    }

    @Test
    public void canGetShadowIncrease(){
        assertEquals(50, phials.getLightIncrease());
    }

    @Test
    public void getStockPrice() {
        assertEquals(15, phials.getStockPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(60, phials.getSellPrice());
    }

    @Test
    public void calculateMarkUp() {
        assertEquals(45, phials.calculateMarkUp());
    }

    @Test
    public void characterSays() {
        assertEquals("We'll defeat the Dark Lord yet!", phials.characterSays());
    }
}