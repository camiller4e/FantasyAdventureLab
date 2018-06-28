import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLightning {

    Lightning lightning;

    @Before
    public void setUp() {
        lightning = new Lightning(10, 1);
    }

    @Test
    public void getATK() {
        assertEquals(10, lightning.getATK());
    }

    @Test
    public void getMP() {
        assertEquals(1, lightning.getMP());
    }
}
