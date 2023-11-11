package AbstractClasses;

public class Rettangolo extends Forma {
public double calcolaArea(){
    double area = getAltezza()*getBase();
    System.out.println("L'area del rettangolo è: " + area);
    return area;
    }
}
