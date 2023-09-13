package Memento;

public class Demo {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        for (int i = 0; i <= 5; i++) {
            originator.set("State" + i);
            careTaker.addMemento(originator.saveToMemento());
        }

        while (careTaker.hasMemento()) {
            originator.restoreFromMemento(careTaker.getMemento());
            System.out.println(originator);
        }
    }

    // Output:
    // Originator: Setting state to State0
    // Originator: Saving to Memento.
    // Originator: Setting state to State1
    // Originator: Saving to Memento.
    // Originator: Setting state to State2
    // Originator: Saving to Memento.
    // Originator: Setting state to State3
    // Originator: Saving to Memento.
    // Originator: Setting state to State4
    // Originator: Saving to Memento.
    // Originator: Setting state to State5
    // Originator: Saving to Memento.
    // Originator: State after restoring from Memento: State5
    // Originator: Current state: State5
    // Originator: State after restoring from Memento: State4
    // Originator: Current state: State4
    // Originator: State after restoring from Memento: State3
    // Originator: Current state: State3
    // Originator: State after restoring from Memento: State2
    // Originator: Current state: State2
    // Originator: State after restoring from Memento: State1
    // Originator: Current state: State1
    // Originator: State after restoring from Memento: State0
    // Originator: Current state: State0
}
