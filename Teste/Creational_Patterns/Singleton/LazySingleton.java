package Creational_Patterns.Singleton;

// Lazy Singleton pattern
public class LazySingleton {
    private String name;
    private static LazySingleton instance = null;

    private LazySingleton(String name) {this.name = name;}

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton("Ermita");
        }
        return instance;
    }

    @Override
    public String toString() {
        return "LazySingleton: " + name;
    }
}
