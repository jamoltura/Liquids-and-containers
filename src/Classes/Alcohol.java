package Classes;

import Enums.TipJidkost;

public class Alcohol extends Jidkost{

    public Alcohol() {
        super(TipJidkost.ALCOHOL);
    }

    @Override
    public int volume() {
        return 0;
    }
}
