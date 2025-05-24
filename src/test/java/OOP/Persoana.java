package OOP;

public class Persoana {
    // OOP = pogramare orientata obiect
    // 4 principii: mostenire, incapsulare, polimorfism, abstractizare
    // mostenirea = conceptul prin care o clasa (copil) mosteneste o alta clasa (parinte)
    // in java se poate mosteni o singura clasa
    // atunci cand o clasa mosteneste o alta clasa, clasa copil trebuie sa apeleze constructorul din parinte
    // atunci cand se aplica mostenirea, copilul are vizibilitate asupra variabilelor / metodelor din parinte
    // constructorul din parinte in copil se apeleaza cu 'super'

    // incapsulare = procesul prin care tinem departe anumite informatii ca ele sa nu poata fi modificate
    // facem variabilele / metode din public in private
    // private = access control car restrictioneza accesul doar in clasa respectiva (aici - doar parintele il detine)
    // ca sa extragem / modificam o valoare a unei variabile private, ne folosim de metode get / set


    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana () {
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
