package Interface;

public class Triangolo implements Forma {
    int base = 3;
    int altezza = 4;



    @Override
    public int calcolaArea() {
        return (base * altezza)/2;
    }
}
