package AbstractClasses;

public class Triangolo extends Forma {
    public double calcolaArea() {
        double area = (getBase() * getAltezza()) / 2;
        System.out.println("L'area del triangolo è: " + area);
        return area;
    }
}