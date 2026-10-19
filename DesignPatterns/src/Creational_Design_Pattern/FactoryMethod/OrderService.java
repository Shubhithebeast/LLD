package Creational_Design_Pattern.FactoryMethod;

public class OrderService {


    public void sendNotification() {
        NotificationFactory factory = new SMSFactory();
        Notification notification = factory.createNotification();
        notification.send();
    }
}
