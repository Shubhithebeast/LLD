package Structural_Design_Pattern.DecorateDesign;

public abstract class PizzaDecorator implements Pizza {

    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

}
