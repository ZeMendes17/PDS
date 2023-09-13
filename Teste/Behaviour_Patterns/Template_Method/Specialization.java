package Template_Method;

public abstract class Specialization extends Generalization {
    // 4. Derived classes can override placeholder methods
    // 1. Standardize the skeleton of an algorithm in a "template" method
    protected void stepThr() {
        step3_1();
        step3_2();
        step3_3();
    }
    
    // 2. Common implementations of individual steps are defined in base class
    protected void step3_1() {
        System.out.println("Specialization.step3_1");
    }

    abstract protected void step3_2();
    
    // 3. Steps requiring peculiar implementations are "placeholders" in the base class
    protected void step3_3() {
        System.out.println("Specialization.step3_3");
    }
}
