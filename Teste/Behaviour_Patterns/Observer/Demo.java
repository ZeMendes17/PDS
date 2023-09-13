package Observer;

public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new BinObserver(subject);
        new OctObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        // Output:
        // First state change: 15
        // Hex String: f
        // Binary String: 1111
        // Octal String: 17
        // Second state change: 10
        // Hex String: a
        // Binary String: 1010
        // Octal String: 12
    }
}
