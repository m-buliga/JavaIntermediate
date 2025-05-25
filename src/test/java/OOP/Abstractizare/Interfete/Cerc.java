package OOP.Abstractizare.Interfete;

public class Cerc implements FormeGeometrice {

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

    @Override
    public void deseneaza() {
        System.out.println("Deseneaza cerc.");

    }
}
