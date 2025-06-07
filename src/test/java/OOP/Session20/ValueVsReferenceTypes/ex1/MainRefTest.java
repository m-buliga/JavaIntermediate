package OOP.Session20.ValueVsReferenceTypes.ex1;

public class MainRefTest {

    public static void main(String[] args) {
        RefTest ref = new RefTest();

        // printez referinta
        System.out.println(ref);

        // printez valoarea
        System.out.println(ref.name);
    }
}
