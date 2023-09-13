public class ChainOfResponsabilityMain {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        
        h1.setSuccessor(h2);
        
        Request r1 = new Request("R1", "R1 Description");
        Request r2 = new Request("R2", "R2 Description");
        Request r3 = new Request("R3", "R3 Description");

        h1.handleRequest(r1);
        h1.handleRequest(r2);
        h1.handleRequest(r3);

        // Output:
        // ConcreteHandler1 handling R1
        // ConcreteHandler2 handling R2
        // ConcreteHandler1 handling R3
    }
}
