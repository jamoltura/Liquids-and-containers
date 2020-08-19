package Classes;

import Enums.TipJidkost;

public abstract class Jidkost {

    private TipJidkost tipJidkost;
    private int plotnost;
    private String name;
    private int litr;

    public Jidkost(TipJidkost tipJidkost) {
        this.tipJidkost = tipJidkost;
        switch (tipJidkost){
            case ALCOHOL -> {
                plotnost = 789;
                name = "Alcohol";
            }
            case WATER -> {
                plotnost = 997;
                name = "Water";
            }
            case PETROL -> {
                plotnost = 740;
                name = "Petrol";
            }
        }
    }

    public String toString(){
        return name;
    }

    public abstract int volume();

    public TipJidkost getTipJidkost() {
        return tipJidkost;
    }

    public int getPlotnost() {
        return plotnost;
    }

    public String getName() {
        return name;
    }

    public int getLitr() {
        return litr;
    }
}
