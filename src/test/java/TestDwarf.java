import GoodGuys.Fighters.Dwarf;
import Hings.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDwarf {

    Dwarf dwarf;
    Axe axe;

    @Before
    public void setUp() throws Exception {
        axe = new Axe(10);
        dwarf = new Dwarf(axe, 100, "Glom", 5);
    }

    @Test
    public void hasAxe() {
        assertEquals(axe, dwarf.getWeapon());
    }

    @Test
    public void hasHP() {
        assertEquals(100, dwarf.getHP());
    }

    @Test
    public void hasName() {
        assertEquals("Glom", dwarf.getName());
    }

    @Test
    public void hasBeardLength() {
        assertEquals(5, dwarf.getBeardLength());
    }
}
