package OOP.Session20.StaticExample.ex2;

public class Angajat {
    static int numarAngajat = 0;

    public void numarAngajati() {
        numarAngajat = numarAngajat + 1;
        System.out.println("Numar angajati: " + numarAngajat);
    }

}
