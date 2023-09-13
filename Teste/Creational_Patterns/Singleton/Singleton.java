package Creational_Patterns.Singleton;

// Singleton pattern
public class Singleton {
    private String name;
    private static Singleton instance = new Singleton("Ermita");

    private Singleton(String name) {this.name = name;}

    public static Singleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton: " + name;
    }
}
