package AbstractClasses;

public abstract class Forma {
    private int base = 6;
    private int altezza = 5;

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public abstract void calcolaArea();
}
