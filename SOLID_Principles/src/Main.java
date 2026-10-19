import DIP.MySqlDB;
import DIP.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Single Responsibility Principle (SRP): A class should have only one reason to change,
        // meaning that a class should have only one job or responsibility.

        // Open-Closed Principle (OCP): Software entities (classes, modules, functions, etc.) or Code
        // should be open for extension but closed for modification.

        // Liskov Substitution Principle (LSP): Objects of a superclass should be replaceable with
        // objects of its subclasses without affecting the correctness of the program.
        PaymentService paymentService = new PaymentService();
        NonRefundablePayments cryptoPayment = new Crypto();
        paymentService.processTransaction(cryptoPayment);

        List<Payment> payments = List.of(new CreditCard(), new UPI());

        for (Payment payment : payments) {
            paymentService.processTransaction(payment);
        }

        // Interface Segregation Principle (ISP): Clients should not be forced to depend on interfaces they do not use.
        // In other words, an interface should have only the methods that are relevant to the implementing class.

        // Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules.
        // Both should depend on abstractions (e.g., interfaces).

        UserService user1 = new UserService(new MySqlDB());
        user1.saveData("shuhb");

        UserService user2 = new UserService(new MySqlDB());
        user2.saveData("saman");


    }
}