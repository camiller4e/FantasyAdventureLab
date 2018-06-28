import Hings.HealthPotion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHealthPotion {

    HealthPotion healthPotion;

    @Before
    public void setUp() {
        healthPotion = new HealthPotion(5);
    }

    @Test
    public void getHealth() {
        assertEquals(5, healthPotion.getHeal());
    }
}
