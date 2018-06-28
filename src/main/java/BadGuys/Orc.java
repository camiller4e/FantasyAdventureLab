package BadGuys;

import Behaviours.IAttack;
import Behaviours.IBeastAtack;
import GoodGuys.Sprite;

public class Orc extends Enemy implements IBeastAtack {

    public Orc(int HP, int ATK) {
        super(HP, ATK);
    }

    public void beastAttack(Sprite sprite) {
        sprite.setHP((sprite.getHP() - getATK()));
    }
}
