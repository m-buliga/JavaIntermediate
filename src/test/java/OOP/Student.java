package OOP;

public class Student  extends Persoana {

    private String facultate;
    private String an;
    private Boolean bursa;

    public Student(String nume, String prenume, Integer varsta, String facultate, String an, Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;
    }

    public void infoStudent() {
        infoPersoana();
        System.out.println("Facultatea este: " + facultate);
        System.out.println("Anul este: " + an);
        System.out.println("Studentul are bursa? " + bursa);
    }

    // polimorfism dinamic
    public void mananca() {
        System.out.println("Studentul mananca atunci cand are timp.");

        // folosind keyword 'super' apelam metoda din parinte
        super.mananca();
    }

    public void absolvire() {
        System.out.println("Studentul cu numele " + getNume() + " si prenumele " + getPrenume() + " a absolvit.");
    }

    public String getFacultate() {
        return facultate;
    }

    public String getAn() {
        return an;
    }

    public Boolean getBursa() {
        return bursa;
    }

    public void setAn(String an) {
        this.an = an;
    }

    public void setBursa(Boolean bursa) {
        this.bursa = bursa;
    }
}
