package StringBuilder2;
public class UnicodeMain {
    public static void main(String[] args) {
        String input = "Cose a caso";
        Unicode extractor = new Unicode(input);

        int index = 7;
        String result = extractor.extractUnicodeCharacter(index);
        System.out.println(result);
    }
}
