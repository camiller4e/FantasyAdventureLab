import BadGuys.Enemy;
import BadGuys.Orc;
import GoodGuys.Fighters.Barbarian;
import GoodGuys.Sprite;
import Hings.Axe;
import Hings.Sword;
import Hings.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBarbarian {

    Barbarian barbarian;
    Sword sword;
    Axe axe;
    Orc orc;

    @Before
    public void setUp() throws Exception {
        sword = new Sword(10);
        barbarian = new Barbarian(sword, 100, "Barbara", 2);
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

    @Test
    public void hasRageLevel() {
        assertEquals(2, barbarian.getRageLevel());
    }

    @Test
    public void canChangeWeapon() {
        Weapon weapon = new Axe(15);
        barbarian.setWeapon(axe);
        assertEquals(axe, barbarian.getWeapon());
    }

    @Test
    public void canAttack() {
        Orc orc = new Orc(10, 5);
        barbarian.attack(orc);
        assertEquals(0, orc.getHP());
    }
}
