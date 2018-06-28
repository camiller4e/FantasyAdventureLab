package GoodGuys.Fighters;

import Hings.Weapon;

public class Barbarian extends Fighter {

    private int rageLevel;

    public Barbarian(Weapon weapon, int HP, String name, int rageLevel) {
        super(weapon, HP, name);
        this.rageLevel = rageLevel;
    }

    public int getRageLevel() {
        return rageLevel;
    }
}
