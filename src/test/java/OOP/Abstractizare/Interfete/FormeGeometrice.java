package OOP.Abstractizare.Interfete;

public interface FormeGeometrice {
    // public static final - pot defini metode, dar toate declarate aici sunt by default abtracte
    // implementarea efectiva se va face in clasele concrete, unde implementez interfata
    // public static final - permite doar constante, nu si proprietati care nu sunt initializate


    public static final String culoare = "alb";

    void calculeazaArie();

    void deseneaza();

}
