package ObiectConstructor;

public class Avion {

    // constructor = are ca rol sa initializeze variabilele unei clase
    // recunoastem un constructor dupa numele clasei
    // intr-o clasa putem avea n constructori care se diferentiaza dupa numarul sau tipul de parametri
    // exista 2 tipuri de constructori: cu sau fara parametri
    // intr-o clasa avem tot timpul un constructor default (fara parametri)
    // constructorul trebuie sa fie Public

    // obiect = instanta unei clase
    // dontr-o clasa putem face mai multe obiecte
    // ca sa initializam un obicet ne folosim de cuvantul 'new'
    // cand se initializeaza un obiect, se apeleaza constructorul clasei

    public String tip;
    public String marca;
    public String model;
    public Integer capacitatePasageri;
    public String tipCombustibil;
    public Integer numarBagaje;

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
    }

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil, Integer numarBagaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.numarBagaje = numarBagaje;
    }

    public void prezentareAvion() {
        System.out.println("Tipul avionului este: " + tip);
        System.out.println("Marca avionului este: " + marca);
        System.out.println("Modelul avionului este: " + model);
        System.out.println("Capacitatea de pasageri a avionului este: " + capacitatePasageri);
        System.out.println("Tipul de combustibil a avionului este: " + tipCombustibil);
        if (numarBagaje != null) {
            System.out.println("Numarul de bagaje este: " + numarBagaje);
        } else {
            System.out.println("Avionul nu are bagaje.");
        }
    }
}
