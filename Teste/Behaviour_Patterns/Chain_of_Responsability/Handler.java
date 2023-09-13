// Handler interface for the Chain of Responsibility pattern.

public interface Handler {
    public void handleRequest(Request request);
    public void setSuccessor(Handler next);
}