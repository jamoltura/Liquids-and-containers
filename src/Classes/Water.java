package Classes;

import Enums.TipJidkost;

public class Water extends Jidkost{

    public Water() {
        super(TipJidkost.WATER);
    }

    @Override
    public int volume() {
        return 0;
    }
}
