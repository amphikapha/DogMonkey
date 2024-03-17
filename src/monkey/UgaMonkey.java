package monkey;

import utils.Config;

public class UgaMonkey extends Monkey {
    private int def;
    public UgaMonkey() {
        super(Config.MONKEY_HP);
        this.def = Config.UGA_MONKEY_DEF;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
