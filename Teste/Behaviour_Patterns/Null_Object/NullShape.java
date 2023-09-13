package Null_Object;

public class NullShape extends Shape {
    public NullShape() {
        this.name = "Null";
    }

    @Override
    public void draw() {
        System.out.println("Drawing nothing.");
    }
}
