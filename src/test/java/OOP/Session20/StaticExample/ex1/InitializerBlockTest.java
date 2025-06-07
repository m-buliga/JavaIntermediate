package OOP.Session20.StaticExample.ex1;

public class InitializerBlockTest {
    private static String name = "Ana";

    static {
        System.out.println("Setting field");
        name = "Test";
    }

    public InitializerBlockTest() {
        name = "Maria";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        InitializerBlockTest test = new InitializerBlockTest();
        System.out.println(test.name);
    }
}
