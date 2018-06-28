package GoodGuys.Mages;

import GoodGuys.Familiar;
import GoodGuys.Sprite;
import Hings.Spell;

import java.util.ArrayList;

public class

Mage extends Sprite {
    private Spell spell;
    private int MP;
    private Familiar familiar;

    public Mage(int HP, String name, Spell spell, int MP, Familiar familiar) {
        super(HP, name);
        this.spell = spell;
        this.MP = MP;
        this.familiar = familiar;
    }

    public Spell getSpell() {
        return spell;
    }

    public int getMP() {
        return MP;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setFamiliar(Familiar familiar) {
        this.familiar = familiar;
    }
}

