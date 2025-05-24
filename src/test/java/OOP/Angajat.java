package OOP;

public class Angajat extends Persoana {

    private String firma;
    private Integer experienta;
    private Integer zileConcediu;

    public Angajat(String nume, String prenume, Integer varsta, String firma, Integer experienta, Integer zileConcediu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileConcediu = zileConcediu;
    }

    public void infoAngajat() {
        infoPersoana();
        System.out.println("Firma este: " + firma);
        System.out.println("Experienta este: " + experienta);
        System.out.println("Numarul zilelor de concediu este: " + zileConcediu);
    }

    public void promovare() {
        System.out.println("Angajatul cu numele " + getNume() + " a fost promovat.");
    }

    public String getFirma() {
        return firma;
    }

    public Integer getExperienta() {
        return experienta;
    }

    public Integer getZileConcediu() {
        return zileConcediu;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    public void setZileConcediu(Integer zileConcediu) {
        this.zileConcediu = zileConcediu;
    }
}
