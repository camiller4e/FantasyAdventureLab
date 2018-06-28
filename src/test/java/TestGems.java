import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGems {

    Gems gems;

    @Before
    public void setUp(){
        gems = new Gems(10);
    }

    @Test
    public void getValue() {
        assertEquals(10, gems.getValue());
    }
}
