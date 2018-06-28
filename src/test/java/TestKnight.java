import GoodGuys.Fighters.Dwarf;
import GoodGuys.Fighters.Knight;
import Hings.Axe;
import Hings.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestKnight {

    Knight knight;
    Sword sword;

    @Before
    public void setUp() throws Exception {
        sword = new Sword(10);
        knight = new Knight(sword, 100, "Brienne", 3);
    }

    @Test
    public void hasSword() {
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void hasHP() {
        assertEquals(100, knight.getHP());
    }

    @Test
    public void hasName() {
        assertEquals("Brienne", knight.getName());
    }

    @Test
    public void hasArmor() {
        assertEquals(3, knight.getArmor());
    }
}
