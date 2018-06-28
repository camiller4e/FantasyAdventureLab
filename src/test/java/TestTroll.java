import BadGuys.Orc;
import BadGuys.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTroll {

    Troll troll;

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
    }

