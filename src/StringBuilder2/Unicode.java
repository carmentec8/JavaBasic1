package StringBuilder2;

public class Unicode {
    private String inputString;
    public Unicode(String inputString) {
        this.inputString = inputString;
    }
    public String extractUnicodeCharacter(int index) {
        if (index < 0 || index >= inputString.length()) {
            return "Errore: Indice non valido";
        }

        char character = inputString.charAt(index);
        StringBuilder result = new StringBuilder();
        result.append("Il carattere in Unicode all'indice " + index + " è: ");
        result.append(String.format("\\u%04x", (int) character));

        return result.toString();
    }
}
