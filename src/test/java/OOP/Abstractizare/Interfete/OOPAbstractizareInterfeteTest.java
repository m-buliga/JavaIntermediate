package OOP.Abstractizare.Interfete;

import org.testng.annotations.Test;

public class OOPAbstractizareInterfeteTest {
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
