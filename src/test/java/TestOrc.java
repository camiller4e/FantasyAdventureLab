import BadGuys.Orc;
import GoodGuys.Fighters.Knight;
import Hings.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOrc {

    Orc orc;
    Knight knight;
    Sword sword;

    @Before
    public void setUp() throws Exception {
        orc = new Orc(20, 5);

    }

    @Test
    public void hasHP() {
        assertEquals(20, orc.getHP());
    }

    @Test
    public void hasATK() {
        assertEquals(5, orc.getATK());
    }

    @Test
    public void canAttack() {
        sword = new Sword(5);
        knight = new Knight(sword, 100, "Brienne", 3);
        orc.beastAttack(knight);
        assertEquals(95, knight.getHP());
    }
}
