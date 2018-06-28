package GoodGuys.Fighters;

import BadGuys.Enemy;
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

    public void attack(Enemy enemy) {
        enemy.setHP(enemy.getHP() - weapon.getATK());
    }}
