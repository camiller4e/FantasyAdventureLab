import GoodGuys.Cleric;
import Hings.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCleric {

    Cleric cleric;
    Sword smallSword;
    Potion healthPotion;
    Potion magicPotion;

    @Before
    public void setUp() throws Exception {
        smallSword = new Sword(1);
        cleric = new Cleric(50, "Anders", healthPotion, smallSword);

    }

    @Test
    public void hasHP() {
        assertEquals(50, cleric.getHP());
    }

    @Test
    public void hasName() {
        assertEquals("Anders", cleric.getName());
    }

    @Test
    public void canChangePotion() {
        magicPotion = new MagicPotion(5);
        cleric.setPotion(magicPotion);
        assertEquals(magicPotion, cleric.getPotion());
    }
}
