import java.util.ArrayList;

public class Mage extends Sprite {
    private ArrayList<Spell> spells;
    private int MP;

    public Mage(int HP, String name, int MP) {
        super(HP, name);
        this.spells = spells;
        this.MP = MP;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public int getMP() {
        return MP;
    }
}

