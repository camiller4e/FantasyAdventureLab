import java.util.ArrayList;

public class Sprite {
    private int HP;
    private String name;
    private ArrayList<Treasure> bag;

    public Sprite(int HP, String name) {
        this.HP = HP;
        this.name = name;
        this.bag = bag;
    }

    public int getHP() {
        return HP;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Treasure> getBag() {
        return bag;
    }
}
