public class Request {
    private String requestType;
    private String requestDescription;
    private boolean handled;
    
    public Request(String type, String description) {
        requestType = type;
        requestDescription = description;
        handled = false;
    }
    
    public String getRequestType() {
        return requestType;
    }
    
    public String getRequestDescription() {
        return requestDescription;
    }
    
    public boolean isHandled() {
        return handled;
    }
    
    public void markHandled() {
        handled = true;
    }
}
