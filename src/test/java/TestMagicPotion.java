import Hings.MagicPotion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMagicPotion {

    MagicPotion magicPotion;

    @Before
    public void setUp(){
        magicPotion =  new MagicPotion(10);
    }

    @Test
    public void getHealthRestoredBy() {
        assertEquals(10, magicPotion.getRestoreMP());
    }
}
