package Creational_Design_Pattern.FactoryDesign;

public class OrderService {

    EmailNotification emailNotification = new EmailNotification();
    SMSNotification smsNotification = new SMSNotification();

    public void SendNotificationEmail(){
        emailNotification.send();
    }

    public void SendNotificationSMS(){
        smsNotification.send();
    }
}
