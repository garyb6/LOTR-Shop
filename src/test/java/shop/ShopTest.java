package shop;

import behaviours.ISell;
import items.ENUMs.Cure;
import items.ENUMs.ItemElement;
import items.ENUMs.ItemType;
import items.armour.Chainmail;
import items.armour.Helmet;
import items.medicine.Athelas;
import items.medicine.Lembas;
import items.powerups.Ashes;
import items.powerups.Phials;
import items.weapons.Axe;
import items.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop shop;
    private Chainmail chainmail;
    private Helmet helmet;
    private Athelas athelas;
    private Lembas lembas;
    private Ashes ashes;
    private Phials phials;
    private Axe axe;
    private Sword sword;


    @Before
    public void setUp() {
        shop = new Shop("Edoras Emporium");
        chainmail = new Chainmail("Bilbo's Mithril Shirt", "Value greater than the value of the whole Shire and everything in it", ItemType.Defence,
                500, 1000, 50, ItemElement.Light, 2 );
        helmet = new Helmet ("Durin's Helm", "Helm of the late Dwarf Lord, Durin the Deathless", ItemType.Defence,
                10, 50, 5, ItemElement.None, 1 );
        athelas = new Athelas("Fresh Athelas", "Revives Character", ItemType.Healing,
                50, 150, Cure.Revive, "Athelas reignites the Light within you");
        lembas = new Lembas("Quarter Lembas Loaf", "Increase Health by 25", ItemType.Healing,
                5, 15, Cure.Health, 25);
        ashes = new Ashes("Ashes of Orthanc", "Increases Shadow Power by 20", ItemType.Powering,
                10, 50, ItemElement.Shadow, 20  );
        phials = new Phials("Phial of Valinor", "Increase Light Power by 50", ItemType.Powering,
                15, 60, ItemElement.Light, 50);
        axe = new Axe("Gimli's Axe", "There's plenty for the both of us, let the best dwarf win", ItemType.Attack,
                250, 750, 50, ItemElement.Light, false);
        sword = new Sword ("Anduril", "Renewed shall be blade that was broken", ItemType.Attack,
                250, 1000, 40, ItemElement.Light, true);
    }

    @Test
    public void canGetName() {
        assertEquals("Edoras Emporium", shop.getName());
    }

    @Test
    public void checkStockStartsEmpty() {
        assertEquals(0, shop.checkStockNumber());
    }

    @Test
    public void canAddItemToStockList(){
        shop.addItem(axe);
        assertEquals(1, shop.checkStockNumber());
    }
}