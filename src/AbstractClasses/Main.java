package AbstractClasses;

public class Main {
    public static void main(String[] args){
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();

        double areaRett= rettangolo.calcolaArea();
        double areaTriang= triangolo.calcolaArea();
    }
}
