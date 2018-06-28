package BadGuys;

import Behaviours.IAttack;

public class Troll extends Enemy implements IAttack {

    public Troll(int HP, int ATK) {
        super(HP, ATK);
    }
}
