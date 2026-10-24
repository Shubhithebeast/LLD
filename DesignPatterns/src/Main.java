import java.util.List;

import Creational_Design_Pattern.AbstarctPattern.DeliveryService;
import java.util.Arrays;
import java.util.ArrayList;

import Creational_Design_Pattern.AbstarctPattern.DeliveryService;
import Creational_Design_Pattern.AbstarctPattern.OrderService;
import Creational_Design_Pattern.BuilderDesign.EmailService;
import Creational_Design_Pattern.BuilderDesign.UserMigrationService;
import Creational_Design_Pattern.PrototypeDesign.GameBotCharacter;
import Creational_Design_Pattern.SingeltonDesign.Calculator;
import Structural_Design_Pattern.AdapterDesign.PaymentClient;
import Structural_Design_Pattern.AdapterDesign.PaypalAdapter;
import Structural_Design_Pattern.AdapterDesign.PaypalGateway;
import Structural_Design_Pattern.AdapterDesign.RazorpayAdapter;
import Structural_Design_Pattern.AdapterDesign.RazorpayGateway;
import Structural_Design_Pattern.ProxyDesign.Movies;
import Structural_Design_Pattern.ProxyDesign.Video;
import Creational_Design_Pattern.BuilderDesign.LoginService;

public class Main {
    public static void main(String[] args) {


        // ---------------- Creational Design Patterns ----------------

        // Factory pattern - It is design pattern which is used to create objects without exposing the creation logic
        // to the client and refer to newly created object using a common interface.

        // Factory Method pattern - It is design pattern which defines an interface for creating an object, but let subclasses
        // decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
        // OrderService orderService = new OrderService();
        // orderService.sendNotification();

        // DeliveryService deliveryService = new DeliveryService();
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

        // Calculator c1 = Calculator.getInstance();
        // c1.a = 5;
        // c1.b = 10;
        
        // Calculator c2 = Calculator.getInstance();
        // c2.a = 20;
        // c2.b = 30;
        
        // System.out.println("Sum of c1: " + c1.sum());
        // System.out.println("Sum of c2: " + c2.sum());
 
        // Thread t1 = new Thread(() -> {
        //      Calculator.getInstance();
        // });
        
        // Thread t2 = new Thread(() -> {
        //  Calculator.getInstance();
        // });

        // t1.start();
        // t2.start();

        

        // Prototype pattern - It is design pattern which is used to create a new object by copying an existing object,
        // known as the prototype. This pattern is used when the cost of creating a new object is expensive or complex.

        long startTime = System.currentTimeMillis();

        // GameBotCharacter char1 = new GameBotCharacter("Bot1", 100, 50, new ArrayList<>( Arrays.asList("Sword", "Shield")));        

        // GameBotCharacter char2 = char1.customizeClone();
        // char2.setName("Bot2");
        // GameBotCharacter char3 = char1.customizeClone();
        // char3.setName("Bot3");
        // GameBotCharacter char4 = char1.customizeClone();
        // char4.setName("Bot4");
        // GameBotCharacter char5 = char1.customizeClone();
        // char5.setName("Bot5");
        // List<String> weapons = char5.getWeapons();
        // weapons.add("Axe");
        // weapons.add("Bow");

        // System.out.println(char1);
        // System.out.println(char2);
        // System.out.println(char3);
        // System.out.println(char4);
        // System.out.println(char5);

        long endTime = System.currentTimeMillis();

        // System.out.println("Time taken to create characters: " + (endTime - startTime) + "ms");





        // ---------------- Structural Design Patterns ----------------

        // Adapter pattern - It is a structural design pattern that allows two incompatible system or interfaces to work together.

        // new PaymentClient(new RazorpayAdapter(new RazorpayGateway())).makePayment();


        // Proxy pattern - It is a structural design pattern that provides a surrogate or
        //  placeholder for another object to control access to it.

        Video video1 = new Movies("SampleVideo1.mp4"); 
        Video video2 = new Movies("SampleVideo2.mp4");
        Video video3 = new Movies("SampleVideo3.mp4");
        Video video4 = new Movies("SampleVideo4.mp4");
        // video1.play();    
        // video2.play();    
        // video3.play();
        // video4.play();



    }
}