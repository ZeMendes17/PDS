package Memento;

// Memento pattern
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getSavedState() { return state; }
}
