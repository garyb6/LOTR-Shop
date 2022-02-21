package shop;

import shop.items.ENUMs.Cure;
import shop.items.ENUMs.ItemElement;
import shop.items.ENUMs.ItemType;
import shop.items.armour.Chainmail;
import shop.items.armour.Helmet;
import shop.items.medicine.Athelas;
import shop.items.medicine.Lembas;
import shop.items.powerups.Ashes;
import shop.items.powerups.Phials;
import shop.items.weapons.Axe;
import shop.items.weapons.Sword;
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
        shop.addItem(chainmail);
        shop.addItem(helmet);
        shop.addItem(athelas);
        shop.addItem(lembas);
        shop.addItem(ashes);
        shop.addItem(phials);
        shop.addItem(axe);
        shop.addItem(sword);

    }

    @Test
    public void canGetName() {
        assertEquals("Edoras Emporium", shop.getName());
    }

    @Test
    public void checkStockStartsStocked() {
        assertEquals(8, shop.checkStockNumber());
    }

    @Test
    public void canAddItemToStockList(){
        shop.addItem(axe);
        assertEquals(9, shop.checkStockNumber());
    }

    @Test
    public void canRemoveItemFromStockList(){
        shop.addItem(axe);
        shop.addItem(sword);
        shop.addItem(helmet);
        shop.removeItem(axe);
        assertEquals(10, shop.checkStockNumber());
    }

    @Test
    public void canCalculateTotalProfit(){
        assertEquals(1985, shop.calculateGrossProfit());
    }

    //finding 8 swords? weird.
}