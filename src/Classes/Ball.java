package Classes;

import Enums.TipCapacities;
import Interfaces.Tanks;

public class Ball extends Capacities implements Tanks {

    public Ball() {
        super(TipCapacities.BALL, "Ball");
    }

    @Override
    protected void setParametrs() {

    }

    @Override
    public void volume() {

    }

    @Override
    public void getParametrs() {

    }
}
