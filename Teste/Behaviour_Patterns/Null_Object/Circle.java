package Null_Object;

public class Circle extends Shape {

    public Circle() {
        this.name = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
