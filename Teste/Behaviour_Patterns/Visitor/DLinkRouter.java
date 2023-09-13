package Visitor;

public class DLinkRouter implements Router {
    public void sendData(char[] data) {
        System.out.println("DLinkRouter: Sending data...");
    }

    public void acceptData(char[] data) {
        System.out.println("DLinkRouter: Receiving data...");
    }

    public void accept(RouterVisitor v) {
        v.visit(this);
    }
}
