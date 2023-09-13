package Mediator;

public class Producer extends Thread {
    private Mediator mediator;
    private int id;
    private static int num = 1;

    public Producer(Mediator m) {
        mediator = m;
        id = num++;
    }

    public void run() {
        int num;
        while (true) {
            mediator.storeMessage(num = (int) (Math.random() * 100));
            System.out.println("p" + id + "-" + num + "  ");
        }
    }
}
