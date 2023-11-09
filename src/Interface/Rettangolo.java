package Interface;

public class Rettangolo implements Forma {

        int base=5;
        int altezza = 6;

        @Override
        public int calcolaArea() {
            return base * altezza;
        }
}
