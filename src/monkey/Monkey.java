package monkey;

public abstract class Monkey {
    private int hp;

    public Monkey(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }

    public boolean isDead() {
        if (getHp() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void decreaseHp(int amount) {
        if (this.hp - amount < 0) {
            this.hp = 0;
        } else {
            this.hp -= amount;
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
