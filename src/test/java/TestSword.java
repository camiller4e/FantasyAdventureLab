import Hings.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSword {

    Sword sword;

    @Before
    public void setUp(){
        sword = new Sword(5);
    }

    @Test
    public void getValue() {
        assertEquals(5, sword.getATK());
    }
}
