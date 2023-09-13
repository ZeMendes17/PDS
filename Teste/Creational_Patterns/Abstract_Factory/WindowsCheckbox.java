package Creational_Patterns.Abstract_Factory;

public class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in a Windows style.");
    }
}
