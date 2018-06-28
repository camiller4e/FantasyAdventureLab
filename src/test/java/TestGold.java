import Hings.Gold;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGold {

    Gold gold;

    @Before
    public void setUp(){
        gold = new Gold(100);
    }

    @Test
    public void hasValue() {
        assertEquals(100, gold.getValue());
    }
}
