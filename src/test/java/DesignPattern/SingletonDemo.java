package DesignPattern;

public class SingletonDemo {

    public static void main(String[] args) {
        SingleObject myObject = SingleObject.getInstance();
        myObject.showMessage();
    }
}
