package BadGuys;

public class Enemy {
    private int HP;
    private int ATK;

    public Enemy(int HP, int ATK) {
        this.HP = HP;
        this.ATK = ATK;
    }

    public int getHP() {
        return HP;
    }

    public int getATK() {
        return ATK;
    }
}
