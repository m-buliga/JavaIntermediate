package OOP.Session20.FinalExample.ex1;

public class FinalVariable {

    // 'final' keyword poate fi aplicat pentru outer class, inner class, variabile si metode
    // nu poate fi aplicata la interfete, constructori, blocks de initializare, enums
    // o clasa final nu poate fi mostenita (extinsa)
    // o metoda finala nu poate fi suprascrisa
    // o variabila declarata si initializata final nu poate fi schimbata

    static final int a = 132;

    public static void main(String[] args) {
        System.out.println("a este: " + a);

        // a nu poate primi alte valori pe parcurs pt ca e declarat final (decomenteaza the line below to check)
        // a = a + 1;

    }
}
