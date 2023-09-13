package Creational_Patterns.Abstract_Factory;

public class Demo {
    public static void main(String[] args) {
        // Creating a Windows GUI
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        windowsButton.paint();
        windowsCheckbox.paint();

        // Creating a MacOS GUI
        GUIFactory macosFactory = new MacOSFactory();
        Button macosButton = macosFactory.createButton();
        Checkbox macosCheckbox = macosFactory.createCheckbox();

        macosButton.paint();
        macosCheckbox.paint();

        // Output:
        // Rendering a button in a Windows style.
        // Rendering a checkbox in a Windows style.
        // Rendering a button in a MacOS style.
        // Rendering a checkbox in a MacOS style.
    }
}
