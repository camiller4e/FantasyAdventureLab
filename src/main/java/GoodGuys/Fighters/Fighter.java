package GoodGuys.Fighters;

import GoodGuys.Sprite;
import Hings.Weapon;

public abstract class Fighter extends Sprite {
    public Weapon weapon;

    public Fighter(Weapon weapon, int HP, String name) {
        super(HP, name);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
