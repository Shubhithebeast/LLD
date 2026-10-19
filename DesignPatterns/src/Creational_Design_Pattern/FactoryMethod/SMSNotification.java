package Creational_Design_Pattern.FactoryMethod;

public class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS notification");
    }
}
