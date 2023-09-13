package Memento;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> mementos = new Stack<Memento>();

    public void addMemento(Memento m) {
        mementos.push(m);
    }

    public Memento getMemento() {
        return mementos.pop();
    }

    public boolean hasMemento() {
        return !mementos.isEmpty();
    }
}
