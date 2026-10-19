package Creational_Design_Pattern.FactoryMethod;

public class DeliveryService {

    public void sendNotification() {
        NotificationFactory factory = new EmailFactory();
        Notification notification = factory.createNotification();
        notification.send();
    }
}
