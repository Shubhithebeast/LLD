package Creational_Design_Pattern.FactoryDesign;

public class DeliveryService {

    Notification notification;

    public void sendNotification(String type) {
        if(type.equals("SMS")) {
            notification = new SMSNotification();
        } else if(type.equals("EMAIL")) {
            notification = new EmailNotification();
        }
        notification.send();
    }
}
