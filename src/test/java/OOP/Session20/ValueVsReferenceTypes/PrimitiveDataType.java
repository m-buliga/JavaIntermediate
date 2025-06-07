package OOP.Session20.ValueVsReferenceTypes;

public class PrimitiveDataType {

    // VALOAREA datelor primitive se aloca in memorie

    // byte -> int value from -128 to +127
    byte myByte = 12;

    // Wrappers for all primitive types - min / max values;
    Byte myByteWrapper;

    // short -> 16 bits integer value
    short myShort = 1234;

    // int -> valori intregi negative si pozitive; 32 bits integer values
    int myInt = 978;
    Integer myIntegerWrapper; // poate fi null in comparatie cu primitiva care va fi 0 default daca nu ii dau o valoare explicita

    // long -> 64 bits int value, neg & positive, no decimals
    long myLong = 80000L;

    // float -> 32 bits, aprox 7 decimals
    float myFloat = 6.803f;

    //double -> 64 bits, aprox 15 decimal digits
    double myDouble = 12.55654646;

    // char -> 16 bits, reprezinta un singur character, unicode characters
    char myChar = 'o';

    // boolean -> 1 bit, 2 valori: true sau false
    boolean myBoolean = true;
    boolean testBoolean = (myInt > 200);

}
