import GoodGuys.Familiar;
import GoodGuys.Mages.Warlock;
import GoodGuys.Mages.Wizard;
import Hings.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWizard {

    Wizard wizard;
    Familiar familiar;
    Spell lightning;

    @Before
    public void setUp() throws Exception {
        familiar = new Familiar(50, "Betty the Ogre");
        wizard = new Wizard(80, "Flarp", lightning, 20, familiar);
    }

    @Test
    public void hasHP() {
        assertEquals(80, wizard.getHP());
    }

    @Test
    public void hasName() {
        assertEquals("Flarp", wizard.getName());
    }

    @Test
    public void hasMP() {
        assertEquals(20, wizard.getMP());
    }

    @Test
    public void hasFamiliar() {
        assertEquals(familiar, wizard.getFamiliar());
    }
}
