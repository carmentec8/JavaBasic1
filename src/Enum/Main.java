package Enum;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(9,5,TipoForma.Rettangolo);
        Triangolo triangolo = new Triangolo(6,7, TipoForma.Triangolo);

        System.out.println(rettangolo);
        System.out.println(triangolo);
    }
}
