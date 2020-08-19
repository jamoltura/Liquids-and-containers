package Classes;

import Enums.TipJidkost;

public class Petrol extends Jidkost{

    public Petrol() {
        super(TipJidkost.PETROL);
    }

    @Override
    public int volume() {
        return 0;
    }
}
