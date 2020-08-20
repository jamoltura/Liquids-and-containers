package Classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Cube extends Capacities {

    // значения в сантиметрах
    private double height;
    private double width;
    private double depth;


    public Cube() {
        super("Цилиндр");
    }

    @Override
    protected void setParametrs() {

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.applyLocalizedPattern("###.##");

        height = Double.parseDouble(decimalFormat.format(getRand()));
        width = Double.parseDouble(decimalFormat.format(getRand()));
        depth = Double.parseDouble(decimalFormat.format(getRand()));

        volume = Double.parseDouble(decimalFormat.format(height * width * depth));

        jidkost.volume(volume);
    }

    @Override
    public void getParametrs() {
        String s = "%13s|%10.2f|%10.2f|%10.2f|%20.2f|%14s|%10.2f|%10.2f|\n";
        System.out.printf(s, getName(), getHeight() ,getWidth(), getDepth(), getVolume(), getJidkost().getName(), getJidkost().getKg(), getJidkost().getLitr());
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
}
