package Visitor;

public class TPLinkRouter implements Router {
    public void sendData(char[] data) {
        System.out.println("TPLinkRouter: Sending data...");
    }

    public void acceptData(char[] data) {
        System.out.println("TPLinkRouter: Receiving data...");
    }

    public void accept(RouterVisitor v) {
        v.visit(this);
    }
}
