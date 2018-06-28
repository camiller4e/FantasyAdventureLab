package BadGuys;

import Behaviours.IAttack;
import Behaviours.IBeastAtack;
import GoodGuys.Sprite;

public class Troll extends Enemy implements IBeastAtack {

    public Troll(int HP, int ATK) {
        super(HP, ATK);
    }


    public void beastAttack(Sprite sprite) {
        sprite.setHP((sprite.getHP() - getATK()));
    }

}
