package items.powerups;

import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AshesTest {

    Ashes ashes;

    @Before
    public void setUp() {
        ashes = new Ashes("Ashes of Orthanc", "Increases Shadow Power by 20",
                ItemType.Powering, 10, 50, ItemElement.Shadow, 20  );
    }

    @Test
    public void canGetElement(){
        assertEquals(ItemElement.Shadow, ashes.getElement());
    }

    @Test
    public void canGetShadowIncrease(){
        assertEquals(20, ashes.getShadowIncrease());
    }

    @Test
    public void getStockPrice() {
        assertEquals(10, ashes.getStockPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(50, ashes.getSellPrice());
    }

    @Test
    public void calculateMarkUp() {
        assertEquals(40, ashes.calculateMarkUp());
    }

    @Test
    public void characterSays() {
        assertEquals("We'll get those stinkin' hobbits now!", ashes.characterSays());
    }
}