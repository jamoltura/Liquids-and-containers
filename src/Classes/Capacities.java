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

    // Абстракт метод для парвметры
    protected abstract void setParametrs();

    // Абстракт метод для вывода параметрв в консол
    protected abstract void getParametrs();

    // Создания жидкости
    public void initJidkost(){
        Random rand = new Random();
        switch (rand.nextInt(3)) {
            case 0 -> this.jidkost = new Alcohol();
            case 1 -> this.jidkost = new Water();
            case 2 -> this.jidkost = new Petrol();
        }
    }

    // Получим случайные число
    protected double getRand(){
        Random random = new Random();
        return (random.nextInt(5000) + 100) / 100.0;
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
