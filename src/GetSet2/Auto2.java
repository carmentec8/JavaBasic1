package GetSet2;

public class Auto2 {
    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;

    public void Auto(int cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public String setTarga(String targa) {
        this.targa = targa;
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String setMarca(String marca) {
        this.marca = marca;
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String setModello(String modello) {
        this.modello = modello;
        return modello;
    }

    @Override
    public String toString() {
        return "GetSet2.Auto{" +
                "Cilindrata:" + cilindrata + '\'' +
                ", Targa:'" + targa + '\'' +
                ", Marca:'" + marca + '\'' +
                ", Modello:'" + modello + '\'' +
                '}';
    }
}

