package items.armour;

import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelmetTest {

    Helmet helmet;

    @Before
    public void setUp() {
        helmet = new Helmet ("Durin's Helm", "Helm of the late Dwarf Lord, Durin", ItemType.Defence, 10, 50, 5, ItemElement.None, 1 );
    }

    @Test
    public void getHelmetName(){
        assertEquals("Durin's Helm", helmet.getName());
    }

    @Test
    public void canGetHelmetItemType(){
        assertEquals(ItemType.Defence, helmet.getType());
    }

    @Test
    public void canGetHelmetItemElement(){
        assertEquals(ItemElement.None, helmet.getElement());
    }
}