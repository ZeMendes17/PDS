package Creational_Patterns.Builder;

// Abstract Builder
public abstract class PizzaBuilder {
    protected Pizza pizza = new Pizza();

    public Pizza getPizza() {
        return pizza;
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
