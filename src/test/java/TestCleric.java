import GoodGuys.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCleric {

    Cleric cleric;

    @Before
    public void setUp() throws Exception {
        cleric = new Cleric(50, "Anders");
    }

    @Test
    public void hasHP() {
        assertEquals(50, cleric.getHP());
    }

    @Test
    public void hasName() {
        assertEquals("Anders", cleric.getName());
    }
}
