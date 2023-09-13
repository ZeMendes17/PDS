package Structural_Patterns.Adapter;

public class Rectangle implements Shape {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Rectangle.draw(): (" + x1 + ", " + y1 + ") -> (" + x2 + ", " + y2 + ")");
    }
}
