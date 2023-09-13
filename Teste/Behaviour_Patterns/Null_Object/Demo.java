package Null_Object;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new NullShape();

        for (Shape shape : shapes) {
            shape.draw();
        }

        // Output:
        // Drawing a circle.
        // Drawing a square.
        // Drawing nothing.
    }
}
