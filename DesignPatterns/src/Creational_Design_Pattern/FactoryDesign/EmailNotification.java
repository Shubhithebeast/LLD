package Creational_Design_Pattern.FactoryDesign;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending Email notification");
    }
}
