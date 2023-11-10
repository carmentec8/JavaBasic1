package Inheritance2;

public class Triangolo extends Forma{
    double base = 3;
    double altezza = 5;

    @Override
    public void calcolaArea() {
       System.out.println("L'area del triangolo è: "+ (base*altezza)/2);
    }
}
