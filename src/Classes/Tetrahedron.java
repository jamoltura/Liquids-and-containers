package Classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Tetrahedron extends Capacities {

    private double rebro;

    public Tetrahedron() {
        super("Tetrahedron");
    }

    @Override
    protected void setParametrs() {

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.applyLocalizedPattern("###.##");

        rebro = Double.parseDouble(decimalFormat.format(getRand()));

        volume = Double.parseDouble(decimalFormat.format(Math.sqrt(2) / 12 * Math.pow(rebro, 3)));

        getJidkost().volume(volume);
    }

    @Override
    public void getParametrs() {
        String s = "%13s|Ребро     :%21.2f|%20.2f|%14s|%10.2f|%10.2f|\n";
        System.out.printf(s, getName(), getRebro(), getVolume(), getJidkost().getName(), getJidkost().getKg(), getJidkost().getLitr());
    }

    public double getRebro() {
        return rebro;
    }
}
