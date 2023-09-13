package Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        new Producer(mediator).start();
        new Producer(mediator).start();
        new Consumer(mediator).start();
        new Consumer(mediator).start();
        new Consumer(mediator).start();
        new Consumer(mediator).start();

        // Output:
        // p1-74
        // p2-61
        //     c1-74
        // p1-61
        //     c2-61
        // p2-61
        //     c3-61
        // p1-61
        //     c4-61
    }
}
