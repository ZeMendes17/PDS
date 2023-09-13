package Command;

// Client
public class Client {
    public static void main(String[] args) {
        RemoteController remote = new RemoteController();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        
        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.setCommand(lightOn);
        remote.pressButton();

        // Output:
        // Light is on
        // Light is off
        // Light is on
    }
}
