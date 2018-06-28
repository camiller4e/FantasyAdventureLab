import GoodGuys.Familiar;
import GoodGuys.Mages.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWarlock {

    Warlock warlock;
    Familiar familiar;

    @Before
    public void setUp() throws Exception {
        familiar = new Familiar(50, "Jeff the Dragon");
        warlock = new Warlock(80, "Joben", 20, familiar);
    }

    @Test
    public void hasHP() {
        assertEquals(80, warlock.getHP());
    }

    @Test
    public void hasName() {
        assertEquals("Joben", warlock.getName());
    }

    @Test
    public void hasMP() {
        assertEquals(20, warlock.getMP());
    }

    @Test
    public void hasFamiliar() {
        assertEquals(familiar, warlock.getFamiliar());
    }
}
