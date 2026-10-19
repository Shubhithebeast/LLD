package Creational_Design_Pattern.FactoryMethod;

public class SMSFactory implements NotificationFactory {

    @Override
    public Notification createNotification(){
            return new SMSNotification();
    }

}
