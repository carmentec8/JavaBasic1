package Inheritance2;

public class Rettangolo extends Forma {
    double base = 3;
    double altezza =8;
    @Override
    public void calcolaArea (){
        System.out.println("L'area della forma è: " + base*altezza);
    }
}
