import java.util.ArrayList;

public class Mage extends Sprite {
    private ArrayList<Spell> spells;
    private int MP;
    private Familiar familiar;

    public Mage(int HP, String name, int MP, Familiar familiar;) {
        super(HP, name);
        this.spells = spells;
        this.MP = MP;
        this.familiar = familiar;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public int getMP() {
        return MP;
    }
}

