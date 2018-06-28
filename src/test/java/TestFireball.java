import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFireball {

    Fireball fireball;

    @Before
    public void setUp(){
        fireball = new Fireball(10, 1);
    }


    @Test
    public void getATK() {
        assertEquals(10, fireball.getATK());
    }

    @Test
    public void getMP() {
        assertEquals(1, fireball.getMP());
    }
}
