package items.armour;

import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChainmailTest {

    Chainmail chainmail;

    @Before
    public void setUp(){
        chainmail = new Chainmail("Bilbo's Mithril Shirt", "More expensive than the whole of The Shire", ItemType.Defence, 500, 1000, 50, ItemElement.Light, 2 );
    }

    @Test
    public void canGetChainmailDescription(){
        assertEquals("More expensive than the whole of The Shire", chainmail.getDescription());
    }

    @Test
    public void canGetBodySlot(){
        assertEquals(2, chainmail.getBodySlot());
    }

    @Test
    public void canGetItemElement(){
        assertEquals(ItemElement.Light, chainmail.getElement());
    }

}