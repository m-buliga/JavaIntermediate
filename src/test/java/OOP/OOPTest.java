package OOP;

import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void metodaTest() {
        Student Student1 = new Student("Smith", "Matt", 25, "UBB", "1", true);
        Student1.infoStudent();
        Student1.mananca();
        Persoana Persoana1 = new Persoana("M", "O", 21);


        Angajat Angajat1 = new Angajat("Rex", "Emma", 35, "Company", 10, 24);
        Angajat1.infoAngajat();
        Angajat1.promovare();
        Angajat1.mananca();
        Angajat1.marire();
        Angajat1.marire(5);
        Angajat1.marire("senior");

        AngajatStudent angajatStudent1 = new AngajatStudent("Cooper", "Alex", 32, "MO", 1, 21,
                                                            "UTCN", "3", false);

        Angajat1.infoPersoana();
    }
}
