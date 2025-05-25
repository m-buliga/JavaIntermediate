package OOP.Abstractizare.ClaseAbstracte;

public abstract class FormeGeometrice {

    public String culoare = "albastru";

    public abstract void calculeazaArie();

    public void deseneaza() {
        System.out.println("Deseneaza forma geometrica.");

    }
}
