package GoodGuys.Mages;

import Behaviours.IAttack;
import Behaviours.ISpellAttack;
import GoodGuys.Familiar;
import GoodGuys.Sprite;
import Hings.Spell;
import Hings.Weapon;

public class Wizard extends Mage implements ISpellAttack {

    public Wizard(int HP, String name, Spell spell, int MP, Familiar familiar) {
        super(HP, name, spell, MP, familiar);
    }

    public void magicAttack(Sprite sprite, Spell spell) {
        sprite.setHP(sprite.getHP() - spell.getATK());
    }
}
