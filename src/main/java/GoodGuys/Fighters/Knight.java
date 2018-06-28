package GoodGuys.Fighters;

import Behaviours.IAttack;
import GoodGuys.Sprite;
import Hings.Weapon;

public class Knight extends Fighter implements IAttack {

    private int armor;

    public Knight(Weapon weapon, int HP, String name, int armor) {
        super(weapon, HP, name);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void attack(Sprite sprite, Weapon weapon) {
        sprite.setHP(sprite.getHP() - weapon.getATK());
    }
}
