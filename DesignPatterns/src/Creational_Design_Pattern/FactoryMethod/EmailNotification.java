package Creational_Design_Pattern.FactoryMethod;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending Email notification");
    }
}
