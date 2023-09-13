package Structural_Patterns.Bridge;

public class BigBus implements Vehicle {
    protected Engine engine;

    public BigBus(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\nThe big bus is driving with " + engine + " engine");
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
