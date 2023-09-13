package Creational_Patterns.Builder;

public class Demo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        pizza = waiter.getPizza();
        System.out.println(pizza);

        // Output:
        // Pizza with cross dough, mild sauce and ham+pineapple topping.
        // Pizza with pan baked dough, hot sauce and pepperoni+salami topping.
    }
}
