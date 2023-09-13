package Creational_Patterns.Abstract_Factory;

public class WindowsButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in a Windows style.");
    }
}
