package Creational_Patterns.Builder;

// Product
public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public void setDough(String dough) {
        this.dough = dough;
    }
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getDough() {
        return dough;
    }
    public String getSauce() {
        return sauce;
    }
    public String getTopping() {
        return topping;
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce and " + topping + " topping.";
    }
}
