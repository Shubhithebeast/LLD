package Creational_Design_Pattern.FactoryDesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderService {


    public void sendNotification() {
        List<Notification> notification = NotificationFactory.createNotifications(new ArrayList<>(Arrays.asList("email", "sms", "push")));
        for (Notification n : notification) {
            n.send();
        }
    }
}
