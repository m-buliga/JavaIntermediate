package OOP.Session20.StaticExample.ex2;

public class AngajatTest {
    public static void main(String[] args) {
        System.out.println("Numar initial angajati: " + Angajat.numarAngajat);

        Angajat angajat = new Angajat();
        angajat.numarAngajati();

        Angajat angajat2 = new Angajat();
        angajat2.numarAngajati();
    }
}
