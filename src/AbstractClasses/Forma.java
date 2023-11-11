package AbstractClasses;

public abstract class Forma {
    private double base = 6;
    private double altezza = 5;

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public abstract double calcolaArea();
}
