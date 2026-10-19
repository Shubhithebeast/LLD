import Creational_Design_Pattern.FactoryMethod.DeliveryService;
import Creational_Design_Pattern.FactoryMethod.OrderService;

public class Main {
    public static void main(String[] args) {

        // Factory pattern - It is design pattern which is used to create objects without exposing the creation logic
        // to the client and refer to newly created object using a common interface.

        // Factory Method pattern - It is design pattern which defines an interface for creating an object, but let subclasses
        // decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
        OrderService orderService = new OrderService();
        orderService.sendNotification();

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.sendNotification();


        // Abstract Factory pattern - It is design Pattern which provides an interface for creating families of related
        // or dependent objects without specifying their concrete classes.



    }
}