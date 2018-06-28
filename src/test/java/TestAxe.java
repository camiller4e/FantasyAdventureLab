import Hings.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAxe {

    Axe axe;

    @Before
    public void setUp() {
        axe = new Axe(10);
    }

    @Test
    public void getAttackValue() {
        assertEquals(10, axe.getATK());
    }
}
