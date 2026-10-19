package Creational_Design_Pattern.FactoryDesign;

public class DeliveryService {

    public void sendNotification() {
        Notification notification = NotificationFactory.createNotifications("SMS");
        notification.send();
    }
}
