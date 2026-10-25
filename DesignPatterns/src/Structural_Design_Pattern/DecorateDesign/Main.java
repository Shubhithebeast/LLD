package Structural_Design_Pattern.DecorateDesign;

public class Main {
    public static void main(String[] args) {

        
// Decorator pattern - It is a structural design pattern that allows behavior to be added to an individual object, 
        // dynamically, without affecting the behavior of other objects from the same class.

        Pizza pizza = new MargheritaPizza();

        System.out.println("Description: " + pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new CheeseDecorator(pizza);
        System.out.println("Description: " + pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new MushroomDecorator(pizza);
        System.out.println("Description: " + pizza.getDescription() + " Cost: " + pizza.getCost());

    }

}
