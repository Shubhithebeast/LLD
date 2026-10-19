package Creational_Design_Pattern.FactoryMethod;

public class EmailFactory implements NotificationFactory {

    @Override
    public Notification createNotification(){
        return new EmailNotification();
    }

}
