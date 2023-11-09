package AbstractClasses;

public abstract class Forma {
    private float base = 6;
    private float altezza = 5;

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public abstract void calcolaArea();
}
