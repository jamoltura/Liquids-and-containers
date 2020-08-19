package Classes;

import Enums.TipCapacities;
import Enums.TipJidkost;

import java.util.Random;

public abstract class Capacities {
    private TipCapacities tipCapacities;
    private String name;
    private Jidkost jidkost;

    public Capacities(TipCapacities tipCapacities, String name) {
        this.tipCapacities = tipCapacities;
        this.name = name;
    }

    public String toString(){
        return name;
    }

    protected abstract void setParametrs();

    public void initJidkost(){
        Random rand = new Random(3);
        switch (rand.nextInt()){
            case 1: this.jidkost = new Alcohol();
            case 2: this.jidkost = new Water();
            case 3: this.jidkost = new Petrol();
        }
    }
}
