package Structural_Patterns.Bridge;

public class SmallEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Started Small engine");
    }
}
