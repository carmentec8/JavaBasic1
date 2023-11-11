package Inheritance2;

public class Triangolo extends Forma{
    double base = 3;
    double altezza = 5;

    @Override
    public double calcolaArea() {
        double area = (base*altezza)/2;
       System.out.println("L'area del triangolo è: "+ area);
       return area;
    }
}
