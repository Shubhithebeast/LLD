package Creational_Design_Pattern.FactoryDesign;

import java.util.ArrayList;
import java.util.List;

public class NotificationFactory {

    public static Notification createNotifications(String type) {
        if(type.equals("SMS")) {
            return new SMSNotification();
        } else if(type.equals("EMAIL")) {
            return new EmailNotification();
        }

        throw new IllegalArgumentException("Invalid notification type");
    }

    public static List<Notification> createNotifications(List<String> types) {
        List<Notification> notifications = new ArrayList<>();

        for(String type : types) {
            if(type.equals("SMS")) {
                notifications.add(new SMSNotification());
            } else if(type.equals("EMAIL")) {
                notifications.add(new EmailNotification());
            } else {
                throw new IllegalArgumentException("Invalid notification type: " + type);
            }
        }
        return notifications;
    }
}
