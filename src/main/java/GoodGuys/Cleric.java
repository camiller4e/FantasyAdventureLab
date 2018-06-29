package GoodGuys;

import BadGuys.Enemy;
import Behaviours.IAttack;
import Hings.HealthPotion;
import Hings.Potion;
import Hings.Weapon;

import java.util.ArrayList;

public class Cleric extends Sprite implements IAttack {

    private Potion potion;
    private Weapon weapon;

    public Cleric(int HP, String name, Potion potion, Weapon weapon) {
        super(HP, name);
        this.potion = potion;
        this.weapon = weapon;
    }

    public Potion getPotion() {
        return potion;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void attack(Enemy enemy) {
        enemy.setHP(enemy.getHP() - weapon.getATK());
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }

//    public void use(Potion potion, Sprite sprite){
//        if (this.potion = )
//    }
}


