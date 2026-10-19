package Creational_Design_Pattern.AbstarctPattern;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending Email notification");
    }
}
