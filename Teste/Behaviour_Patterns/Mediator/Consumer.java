package Mediator;

public class Consumer extends Thread {
    private Mediator mediator;
    private int id;
    private static int num = 1;

    public Consumer(Mediator m) {
        mediator = m;
        id = num++;
    }

    public void run() {
        while (true) {
            System.out.println("\tc" + id + "-" + mediator.retrieveMessage() + "  ");
        }
    }
}
