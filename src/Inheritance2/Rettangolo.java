package Inheritance2;

public class Rettangolo extends Forma {
    int baseRett = 3;
    int altezzaRett =8;
    @Override
    public void calcolaArea (){
        System.out.println("L'area della forma è: " + baseRett*altezzaRett);
    }

    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();

        forma.calcolaArea();
        rettangolo.calcolaArea();
    }
}
