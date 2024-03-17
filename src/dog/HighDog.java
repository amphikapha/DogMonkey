package dog;

import utils.Config;

public abstract class HighDog extends Dog {
    private int def;

    public HighDog() {
        super(Config.HIGH_DOG_HP);
        this.def = Config.HIGH_DOG_DEF;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
