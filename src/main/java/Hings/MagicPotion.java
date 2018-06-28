package Hings;

public class MagicPotion extends Potion {

    private int restoreMP;

    public MagicPotion(int restoreMP) {
        this.restoreMP = restoreMP;
    }

    public int getRestoreMP() {
        return restoreMP;
    }
}
