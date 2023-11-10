package StringBuiilder1;

public class Main {
        public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "Ciao";

            String compareWords = compareStrings(str1, str2);
            System.out.println(compareWords);
        }

        public static String compareStrings(String str1, String str2) {
            int comparison = str1.compareTo(str2);
            StringBuilder result = new StringBuilder();

            if (comparison == 0) {
                result.append("Le due stringhe sono uguali");
            } else {
                result.append("Le due stringhe sono diverse");
            }

            return result.toString();
        }
    }
