package OOP;

import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void metodaTest() {
        Student Student1 = new Student("Smith", "Matt", 25, "UBB", "1", true);
        Student1.infoStudent();

        Angajat Angajat1 = new Angajat("Rex", "Emma", 35, "Company", 10, 24);
        Angajat1.infoAngajat();

        Angajat1.promovare();
    }
}
