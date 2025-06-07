package OOP.Session20;

public class TestAccessModifier {
    public static void main(String[] args) {
 /*       StaticAccessModifiers staticAccessModifiers = new StaticAccessModifiers();
        System.out.println(staticAccessModifiers.name);*/

        StaticAccessModifiers.name = "new Endava";
        System.out.println(StaticAccessModifiers.name + " 1");

        StaticAccessModifiers.printMessage();

        StaticAccessModifiers staticAccessModifiers2 = new StaticAccessModifiers();
        System.out.println(staticAccessModifiers2.name);
    }
}
