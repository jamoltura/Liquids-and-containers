package Classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ball extends Capacities {

    private double radius;

    public Ball() {
        super("Шар");
    }

    @Override
    protected void setParametrs() {

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.applyLocalizedPattern("###.##");

        radius = Double.parseDouble(decimalFormat.format(getRand()));

        volume = Double.parseDouble(decimalFormat.format((Math.pow(radius, 3) / 0.75) * Math.PI));

        getJidkost().volume(volume);
    }

    @Override
    public void getParametrs() {
        String s = "%13s|Радиус :   %21.2f|%20.2f|%14s|%10.2f|%10.2f|\n";
        System.out.printf(s, getName(), + getRadius(), getVolume(), getJidkost().getName(), getJidkost().getKg(), getJidkost().getLitr());
    }

    public double getRadius() {
        return radius;
    }
}
