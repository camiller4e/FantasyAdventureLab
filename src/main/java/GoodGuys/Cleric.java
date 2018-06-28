package GoodGuys;

import Behaviours.IAttack;
import Hings.Potion;
import Hings.Weapon;

import java.util.ArrayList;

public class Cleric extends Sprite implements IAttack {

    private ArrayList<Potion> potions;

    public Cleric(int HP, String name) {
        super(HP, name);
        this.potions = potions;
    }

    public ArrayList<Potion> getPotions() {
        return potions;
    }

    public void attack(Sprite sprite, Weapon weapon) {
        sprite.setHP(sprite.getHP() - weapon.getATK());
    }
}
