package Creational_Design_Pattern.FactoryDesign;

public class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS notification");
    }
}
