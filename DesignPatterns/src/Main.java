import Creational_Design_Pattern.AbstarctPattern.DeliveryService;
import Creational_Design_Pattern.AbstarctPattern.OrderService;
import Creational_Design_Pattern.BuilderDesign.EmailService;
import Creational_Design_Pattern.BuilderDesign.UserMigrationService;
import Creational_Design_Pattern.SingeltonDesign.Calculator;
import Creational_Design_Pattern.BuilderDesign.LoginService;

public class Main {
    public static void main(String[] args) {

        // Factory pattern - It is design pattern which is used to create objects without exposing the creation logic
        // to the client and refer to newly created object using a common interface.

        // Factory Method pattern - It is design pattern which defines an interface for creating an object, but let subclasses
        // decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
        OrderService orderService = new OrderService();
        // orderService.sendNotification();

        DeliveryService deliveryService = new DeliveryService();
        // deliveryService.sendNotification();


        // Abstract Factory pattern - It is design Pattern which provides an interface for creating families of related
        // or dependent objects without specifying their concrete classes.

        // Builder pattern - It is design pattern which is used to construct a complex object easily,
        //  by keeping  the object creation process flexible, readable and maintainable.

        // new EmailService().sendEmail();
        // new UserMigrationService().migrateUser();
        // new LoginService().registerUser("Shivani", 25, "shivani@example.com", "New Delhi");

        // Singleton pattern - It is design pattern which ensures that a class has only one instance
        // and provides a global point of access to it. 

        Calculator c1 = Calculator.getInstance();
        c1.a = 5;
        c1.b = 10;
        System.out.println("Sum of c1: " + c1.sum());
        
        Calculator c2 = Calculator.getInstance();
        c2.a = 20;
        c2.b = 30;

        System.out.println("Sum of c2: " + c2.sum());






    }
}