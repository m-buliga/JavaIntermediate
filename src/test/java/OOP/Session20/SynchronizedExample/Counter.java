package OOP.Session20.SynchronizedExample;

public class Counter {
    int count;

    // SYNCHRONISED este folosit pentru thread safety
    // poate fi aplicat pe metode si blocks
    //

    synchronized void increment() {
        count++;
    }

}
