package Structural_Patterns.Composite;

public class Product extends Entity {
    private int value;

    public Product(int value) {
        this.value = value;
    }

    @Override
    public void traverse() {
        System.out.println(indent.toString() + value);
    }
}
