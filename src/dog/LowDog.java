package dog;

import utils.Config;

public abstract class LowDog extends Dog {
    public LowDog() {
        super(Config.LOW_DOG_HP);
    }
}
