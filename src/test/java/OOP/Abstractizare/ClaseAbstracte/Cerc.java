package OOP.Abstractizare.ClaseAbstracte;

public class Cerc extends FormeGeometrice {

    private int raza;

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }


    @Override
    public void calculeazaArie() {
        System.out.println("Aria cercului este egala cu: " + Math.PI * Math.pow(raza, 2));

    }
}
