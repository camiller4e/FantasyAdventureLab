import BadGuys.Orc;
import BadGuys.Troll;
import GoodGuys.Fighters.Knight;
import Hings.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTroll {

    Troll troll;
    Sword sword;
    Knight knight;

        @Before
        public void setUp() throws Exception {
            troll = new Troll(20, 5);
        }

        @Test
        public void hasHP() {
            assertEquals(20, troll.getHP());
        }

        @Test
        public void hasATK() {
            assertEquals(5, troll.getATK());
        }

        @Test
        public void canAttack() {
        sword = new Sword(5);
        knight = new Knight(sword, 100, "Brienne", 3);
        troll.beastAttack(knight);
        assertEquals(95, knight.getHP());
    }
    }

