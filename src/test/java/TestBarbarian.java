import GoodGuys.Fighters.Barbarian;
import Hings.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBarbarian {

    Barbarian barbarian;
    Sword sword;

    @Before
    public void setUp() throws Exception {
        sword = new Sword(10);
        barbarian = new Barbarian(sword, 100, "Barbara");
    }

    @Test
    public void hasSword() {
        assertEquals(sword, barbarian.getWeapon());
    }

    @Test
    public void hasHP() {
        assertEquals(100, barbarian.getHP());
    }

    @Test
    public void hasName() {
        assertEquals("Barbara", barbarian.getName());
    }
}
