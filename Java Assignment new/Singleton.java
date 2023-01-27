/**
 * Singleton
 */
public class Singleton {
    Singleton ref;

    private Singleton() {
    }

    public Singleton getReference() {
        if (ref == null) {
            ref = new Singleton();
        }
        return ref;
    }
}