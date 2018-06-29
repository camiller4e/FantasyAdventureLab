import BadGuys.Enemy;
import BadGuys.Orc;
import BadGuys.Troll;
import GoodGuys.Familiar;
import GoodGuys.Fighters.Barbarian;
import GoodGuys.Mages.Wizard;
import GoodGuys.Sprite;
import Hings.Gold;
import Hings.Spell;
import Hings.Sword;
import Hings.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestRoom {

    Room room;
    Treasure treasure;
    ArrayList<Enemy> enemies;
    ArrayList<GoodGuys.Sprite> players;
    Sword sword;
    Spell fireball;
    Familiar familiar;


    @Before
    public void setUp() throws Exception {
        players = new ArrayList<GoodGuys.Sprite>();
        enemies = new ArrayList<BadGuys.Enemy>();
        treasure = new Gold(10);
        sword = new Sword(5);
        Enemy orc = new Orc(10, 10);
        Enemy troll = new Troll(5, 5);
        Barbarian barbarian = new Barbarian(sword, 100, "Barbara", 2);
        Familiar familiar = new Familiar(50, "Betty the Ogre");
        Wizard wizard = new Wizard(80, "Flarp", fireball, 20, familiar);
        players.add(barbarian);
        players.add(wizard);
        enemies.add(orc);
        enemies.add(troll);
        room = new Room(treasure, enemies, players);
    }

    @Test
    public void hasTreasure() {
        assertEquals(treasure, room.getTreasure());
    }

    @Test
    public void hasEnemies() {
        assertEquals(2, enemies.size());
    }

    @Test
    public void hasPlayers() {
        assertEquals(2, players.size());
    }
}
