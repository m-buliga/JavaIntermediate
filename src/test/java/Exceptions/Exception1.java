package Exceptions;

public class Exception1 {
    // exceptions = situatii care apar in timpul executiei unui program care determina oprirea acestuia
    // ofera un mecanism efcient de identificare si rezolvare a erorilor
    // sunt modelate sub forma de clase (predefinite - e.g. error class, exception, runtime exception, se pot face si clase personalizate
    // sunt gestionate folosing try / catch / finally - cuvinte predefinite in java
    // 2 tipuri mari de exceptii:
    // 1. checked (de compilare - nu poti sa build the project daca nu e tratata aceasta exceptie; e.g SQLException, IOException, ClassNotFoundException)
    // 2. unchecked (exceptii de runtime - ignorate in timpul compilarii, dar aruncate in timpul executiei programului; e.g. NullPointerException, ArrayIndexOutOfBound, AritmeticException)
    // throw - cuvant cheie care arunca exceptia in mod explicit de la o metoda sau un bloc de cod
    // throws - cuvant cheie care se foloseste odata cu metoda; poate arunca un tip sau mai multe de exceptii

    public static void main(String[] args) throws CustomException {

/*        try {
            System.out.println(12/0);
        } catch (ArithmeticException e) {
            System.out.println("Error: Aritmetic Exception thrown " + e.getMessage());
        }*/

        try {
            int[] numbers = new int[10];
            numbers[11] = 5;
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println(e.getMessage());
            throw new CustomException("Customized Error Message");
        } finally {
            System.out.println("Line being executed regardless whether an exception is thrown.");
        }

    }
}
