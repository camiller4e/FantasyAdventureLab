package GoodGuys.Fighters;

import Hings.Weapon;

public class Dwarf extends Fighter {

    private int beardLength;

    public Dwarf(Weapon weapon, int HP, String name, int beardLength) {
        super(weapon, HP, name);
        this.beardLength = beardLength;
    }

    public int getBeardLength() {
        return beardLength;
    }
}
