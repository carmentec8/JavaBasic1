package Enum;

public class Triangolo implements Forma {
    private double base;
    private double altezza;
    private final TipoForma triangolo;


    public Triangolo (double base, double altezza, TipoForma Triangolo) {
        this.base = base;
        this.altezza = altezza;
        this.triangolo = Triangolo;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", area=" + calcolaArea()+
                ", triangolo=" + triangolo +
                '}';
    }
    @Override
    public double calcolaArea(){
        return (base * altezza)/2;
    }
}
