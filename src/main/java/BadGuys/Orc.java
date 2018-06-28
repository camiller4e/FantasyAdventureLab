package BadGuys;

import Behaviours.IAttack;

public class Orc extends Enemy implements IAttack {

    public Orc(int HP, int ATK) {
        super(HP, ATK);
    }
}
