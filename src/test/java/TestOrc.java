import BadGuys.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOrc {

    Orc orc;

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
}
