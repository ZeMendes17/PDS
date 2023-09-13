package Structural_Patterns.Adapter;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(), new OldRectangle()};

        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for(Shape s: shapes) {
            s.draw(x1, y1, x2, y2);
        }

        // Output:
        // Rectangle.draw(): (10, 20) -> (30, 60)
        // LegacyRectangle: oldDraw. (10, 20) -> (20, 40)
    }
}
