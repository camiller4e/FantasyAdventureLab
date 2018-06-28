package GoodGuys.Fighters;

import Hings.Weapon;

public class Knight extends Fighter {

    private int armor;

    public Knight(Weapon weapon, int HP, String name, int armor) {
        super(weapon, HP, name);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }
}
