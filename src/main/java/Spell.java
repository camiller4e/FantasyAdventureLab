public abstract class Spell {

    private int ATK;
    private int MP;

    public Spell(int ATK, int MP) {
        this.ATK = ATK;
        this.MP = MP;
    }

    public int getATK() {
        return ATK;
    }

    public int getMP() {
        return MP;
    }
}
