package Structural_Patterns.Bridge;

public class SmallCar implements Vehicle {
    protected Engine engine;

    public SmallCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\nThe small car is driving with " + engine + " engine");
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
