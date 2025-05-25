package OOP.Abstractizare.ClaseAbstracte;

import org.testng.annotations.Test;

public class OOPAbstractizareTest {

    @Test
    public void metodatest() {
        Cerc cerc = new Cerc();
        cerc.setRaza(5);
        cerc.calculeazaArie();
        cerc.deseneaza();

        Patrat patrat = new Patrat();
        patrat.setLatura(12);
        patrat.calculeazaArie();
        patrat.deseneaza();

    }
}
