package GoodGuys.Fighters;

import BadGuys.Enemy;
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

    public void attack(Enemy enemy) {
        enemy.setHP(enemy.getHP() - weapon.getATK());
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
}
