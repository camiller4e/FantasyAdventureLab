import java.util.ArrayList;

public class Cleric extends Sprite {
    private ArrayList<Potion> potions;

    public Cleric(int HP, String name, ArrayList<Potion> potions) {
        super(HP, name);
        this.potions = potions;
    }

    public ArrayList<Potion> getPotions() {
        return potions;
    }
}
