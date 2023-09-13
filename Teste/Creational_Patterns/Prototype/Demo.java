package Creational_Patterns.Prototype;

public class Demo {
    public static void main(String[] args) {
        try {
            PrototypeCapable proto;
            proto = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE);
            System.out.println(proto);

            proto = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM);
            System.out.println(proto);

            proto = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW);
            System.out.println(proto);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Output:
        // Cloning Movie object..
        // Movie: null
        // Cloning Album object..
        // Album: null
        // Cloning Show object..
        // Show: null
    }
}
