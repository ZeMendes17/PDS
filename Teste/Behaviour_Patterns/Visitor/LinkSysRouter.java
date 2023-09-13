package Visitor;

public class LinkSysRouter implements Router {
    public void sendData(char[] data) {
        System.out.println("LinkSysRouter: Sending data...");
    }

    public void acceptData(char[] data) {
        System.out.println("LinkSysRouter: Receiving data...");
    }

    public void accept(RouterVisitor v) {
        v.visit(this);
    }
}
