package Structural_Patterns.Adapter;

public class LegacyRectangle {
    public void oldDraw(int x, int y, int w, int h) {
        System.out.println("LegacyRectangle: oldDraw. (" + x + ", " + y + ") -> (" + w + ", " + h + ")");
    }
}
