public class AutoMain {

    public static void main(String[] args) {
        Auto miaAuto = new Auto(1400, "DH308ZJ", "Opel", "Corsa");
        System.out.println("Cilindrata: " + miaAuto.getCilindrata());
        System.out.println("Targa: " + miaAuto.getTarga());
        System.out.println("Marca: " + miaAuto.getMarca());
        System.out.println("Modello: " + miaAuto.getModello());

        System.out.println("La cilindrata è diventata: " + miaAuto.setCilindrata(1800));
        System.out.println("La targa è diventata: " + miaAuto.setTarga("AB012CD"));
        System.out.println("La marca è diventata: " + miaAuto.setMarca("Audi"));
        System.out.println("Il modello è diventato: " + miaAuto.setModello("A1"));
    }

}