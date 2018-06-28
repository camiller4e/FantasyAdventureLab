package GoodGuys.Fighters;

import BadGuys.Enemy;
import Behaviours.IAttack;
import GoodGuys.Sprite;
import Hings.Weapon;

public class Barbarian extends Fighter implements IAttack {

    private int rageLevel;

    public Barbarian(Weapon weapon, int HP, String name, int rageLevel) {
        super(weapon, HP, name);
        this.rageLevel = rageLevel;
    }

    public int getRageLevel() {
        return rageLevel;
    }

    public void attack(Enemy enemy) {
        enemy.setHP(enemy.getHP() - weapon.getATK());
    }

}
