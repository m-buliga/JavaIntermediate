package OOP.Session20.ValueVsReferenceTypes;

public class ReferenceDataTypes {

    // datele de tip REFERINTA (NON-PRIMITIVE) - sunt obiecte sau referinta la obiecte
    // referentiaza locatia in memorie unde sunt retinute acele date, nu retin valoarea in sine direct


    public static void main(String[] args) {
        String string1 = new String("hello");
        String string2 = new String("hello");
        // String string2 = string1;


        // check below for comparing two references - nu se compara valorile in sine, ci referinta lor (au adrese diferite)
        if (string1 == string2) {
            System.out.println("Cele doua referinte sunt la fel.");
        }
        else {
            System.out.println("Cele doua referinte NU sunt la fel.");
        }


        // check below for comparing two primitives - se compara valorile
        int int1 = 5;
        int int2 = 5;

        if (int1 == int2) {
            System.out.println("Cele doua primitive sunt la fel.");
        }
        else {
            System.out.println("Cele doua primitive NU sunt la fel.");
        }

    }
}
