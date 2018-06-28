import java.util.ArrayList;

public class Room {

    private Hings.Treasure treasure;
    private ArrayList<BadGuys.Enemy> enemies;
    private ArrayList<GoodGuys.Sprite> players;

    public Room(Hings.Treasure treasure, ArrayList<BadGuys.Enemy> enemies, ArrayList<GoodGuys.Sprite> players) {
        this.treasure = treasure;
        this.enemies = enemies;
        this.players = players;
    }

    public Hings.Treasure getTreasure() {
        return treasure;
    }

    public ArrayList<BadGuys.Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<GoodGuys.Sprite> getPlayers() {
        return players;
    }
}
