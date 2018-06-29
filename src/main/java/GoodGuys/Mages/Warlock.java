package GoodGuys.Mages;

import Behaviours.IAttack;
import Behaviours.ISpellAttack;
import GoodGuys.Familiar;
import GoodGuys.Sprite;
import Hings.Spell;

public class Warlock extends Mage implements ISpellAttack {

    public Warlock(int HP, String name, Spell spell, int MP, Familiar familiar) {
        super(HP, name, spell, MP, familiar);
        }

    public void magicAttack(Sprite sprite, Spell spell) {
        sprite.setHP(sprite.getHP() - spell.getATK());
    }





}
