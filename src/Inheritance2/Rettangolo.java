package Inheritance2;

public class Rettangolo extends Forma {
    double baseRett = 3;
    double altezzaRett =8;
    @Override
    public void calcolaArea (){
        System.out.println("L'area della forma è: " + baseRett*altezzaRett);
    }


}
