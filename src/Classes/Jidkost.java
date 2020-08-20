package Classes;

public abstract class Jidkost {

    // Плотности жидкостей кг/м3
    private int plotnost;
    private String name;
    private double litr;
    private double kg;

    public Jidkost(int plotnost, String name) {
        this.plotnost = plotnost;
        this.name = name;
    }

    public String toString(){
        return name;
    }

    // кг/см3 литр/см3        пареметр value в см3
    public void volume(double value){
        kg = plotnost * value / 1000000;
        litr = value / 1000;
    }

    public String getName() {
        return name;
    }

    public double getLitr() {
        return litr;
    }

    public double getKg() {
        return kg;
    }
}
