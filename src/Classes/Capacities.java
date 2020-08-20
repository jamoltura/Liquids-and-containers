package Classes;

import java.util.Random;

public abstract class Capacities {

    private String name;
    protected Jidkost jidkost;

    // значения в сантиметр/куб
    protected double volume;

    public Capacities(String name) {
        this.name = name;
        initJidkost();
        setParametrs();
    }

    public String toString(){
        return name;
    }

    protected abstract void setParametrs();

    protected abstract void getParametrs();

    public void initJidkost(){
        Random rand = new Random();
        switch (rand.nextInt(3)) {
            case 0 -> this.jidkost = new Alcohol();
            case 1 -> this.jidkost = new Water();
            case 2 -> this.jidkost = new Petrol();
        }
    }

    protected double getRand(){
        Random random = new Random();
        return random.nextInt(50) + 10;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public Jidkost getJidkost() {
        return jidkost;
    }
}
