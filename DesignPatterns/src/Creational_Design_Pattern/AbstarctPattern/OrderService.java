package Creational_Design_Pattern.AbstarctPattern;

public class OrderService {


    public void sendNotification() {
        NotificationFactory factory = new SMSFactory();
        Notification notification = factory.createNotification();
        Template template = factory.createTemplate();
        notification.send();
        template.format();
    }
}
