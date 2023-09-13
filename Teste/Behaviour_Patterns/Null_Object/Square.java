package Null_Object;

public class Square extends Shape {
    
        public Square() {
            this.name = "Square";
        }
    
        @Override
        public void draw() {
            System.out.println("Drawing a square.");
        }
}
