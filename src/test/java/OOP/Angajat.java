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

    // suprascriem metoda din parinte (polimorfism dinamic)
    public void mananca() {
        System.out.println("Angajatul mananca atunci cand are pauza de masa.");
    }

    // polimorfism static - o metoda cu aceeasi denumire, dar care se diferentiaza prin tipul de parametri sau prin numarul de parametri
    public void marire() {
        System.out.println("Nu este buget de mariri.");
    }

    public void marire(Integer procent) {
        System.out.println("Angajatul a primit o marire de salariu cu " + procent + " %.");
    }

    public void marire(String grad) {
        System.out.println("Angajatul a primit gradul " + grad + ".");
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
