package Inheritance2;

public class Rettangolo extends Forma {
    double base = 3;
    double altezza =8;
    @Override
    public double calcolaArea (){
        double area = base*altezza;
        System.out.println("L'area della forma è: " + area);
        return area;
    }
}
