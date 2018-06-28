package GoodGuys.Fighters;

import Behaviours.IAttack;
import GoodGuys.Sprite;
import Hings.Weapon;

public class Dwarf extends Fighter implements IAttack {

    private int beardLength;

    public Dwarf(Weapon weapon, int HP, String name, int beardLength) {
        super(weapon, HP, name);
        this.beardLength = beardLength;
    }

    public int getBeardLength() {
        return beardLength;
    }

    public void attack(Sprite sprite, Weapon weapon) {
        sprite.setHP(sprite.getHP() - weapon.getATK());
    }
}
