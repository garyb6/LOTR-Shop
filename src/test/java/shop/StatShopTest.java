package shop;

import org.junit.Before;
import org.junit.Test;
import shop.items.ENUMs.Cure;
import shop.items.ENUMs.ItemType;
import shop.items.medicine.Athelas;
import shop.items.medicine.Lembas;

import static org.junit.Assert.*;

public class StatShopTest {
    private StatShop statShop;
    private Athelas athelas;
    private Lembas lembas;


    @Before
    public void setUp(){
        statShop = new StatShop("House Of Healing");
        athelas = new Athelas("Fresh Athelas", "Revives Character", ItemType.Healing,
                50, 150, Cure.Revive, "Athelas reignites the Light within you");
        lembas = new Lembas("Quarter Lembas Loaf", "Increase Health by 25", ItemType.Healing,
                5, 15, Cure.Health, 25);

    }

    @Test
    public void canCheckMedStock() {
        statShop.addItem(athelas);
        statShop.addItem(lembas);
        assertEquals(2, statShop.checkStockNumber());
    }
}