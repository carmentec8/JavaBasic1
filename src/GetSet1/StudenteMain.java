package GetSet1;

public class StudenteMain {
    public static void main(String[] args){
        Studente studente1 = new Studente("Carmen", "Tecchia", 1234);

        System.out.println("Il nome dello studente è: " + studente1.getNome());
        System.out.println("Il nome dello studente è cambiato in: " +studente1.setNome("Rossella"));
        System.out.println("il cognome dello studente è: " + studente1.getCognome());
        System.out.println("L'identificativo dello studente è: "+ studente1.getIdentificativo());
        System.out.println("I dati dello studente sono:" + studente1);

    }


}
