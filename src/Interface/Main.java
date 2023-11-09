package Interface;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();

        System.out.println("Area del triangolo: " + triangolo.calcolaArea());
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
    }
}
