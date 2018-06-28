import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFamiliar {

    Familiar familiar;

    @Before
    public void setUp() throws Exception {
        familiar = new Familiar(50, "Jeff the Dragon");
    }

    @Test
    public void hasHP() {
        assertEquals(50, familiar.getHP());
    }

    @Test
    public void hasName() {
        assertEquals("Jeff the Dragon", familiar.getName());
    }
}
