package OOP;

public class Persoana {
    // OOP = pogramare orientata obiect
    // 4 principii: mostenire, incapsulare, polimorfism, abstractizare
    // mostenirea = conceptul prin care o clasa (copil) mosteneste o alta clasa (parinte)
    // in java se poate mosteni o singura clasa
    // atunci cand o clasa mosteneste o alta clasa, clasa copil trebuie sa apeleze constructorul din parinte
    // atunci cand se aplica mostenirea, copilul are vizibilitate asupra variabilelor / metodelor din parinte
    // constructorul din parinte in copil se apeleaza cu 'super'

    // INCAPSULARE = procesul prin care tinem departe anumite informatii ca ele sa nu poata fi modificate
    // facem variabilele / metode din public in private
    // private = access control car restrictioneza accesul doar in clasa respectiva (aici - doar parintele il detine)
    // ca sa extragem / modificam o valoare a unei variabile private, ne folosim de metode get / set

    // POLIMORFISM = procesul prin care definim mai multe implementari pentru o metoda
    // poate fi: dinamic (override) si static (overload)
    // polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    // polimorfism static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea numarului sau tipului de parametri

    // ABSTRACTIZARE = reducerea unui element complex la un element mai simplu (reducerea cmopleta a implementarii metodelor lasand doar numele functiilor,
    // parametrii si tipul returnat)
    // se poate obtine prin clase abstracte si / sau interfete

    // CLASELE ABSTRACTE sunt utilizate pentru a declara caracteristici comune ale unei sub clase
    // o clasa abstracta nu poate fi instantiata; ea poate fi utilizata ca si superclasa pentru alte clase care extind clasa abstracta
    // clasa abstracta e definita folosind modificatorul 'abstract'
    // o clasa abstracta poate contine atribute si metode pe langa clasa abstracta

    // INTERFATA ofera raspuns lipsei mostenirii multiple
    // interfara creeaza un protocol pe care claseletrebuie sa il implementeze
    // interfata contine toate metodele abstracte (e o clasa pur abstracta)
    // o clasa poate implemeta mai multe interfete (comma separated)


    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    protected void infoPersoana () {
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
    }

    // definim prima implementare pentru o metoda (polimorfism dinamic)
    public void mananca() {
        System.out.println("Persoana mananca atunci cand ii este foame.");
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
