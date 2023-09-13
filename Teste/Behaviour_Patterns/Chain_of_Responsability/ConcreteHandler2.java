public class ConcreteHandler2 implements Handler {
    private Handler successor;
    
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals("R2")) {
            System.out.println("ConcreteHandler2 handling " + request.getRequestDescription());
            request.markHandled();
        } else {
            System.out.println("ConcreteHandler2 passing on " + request.getRequestDescription());
            if(successor != null)
                successor.handleRequest(request);
            else
                System.out.println("No successor for " + request.getRequestDescription());
        }
    }
    
    @Override
    public void setSuccessor(Handler next) {
        this.successor = next;
    }
}
