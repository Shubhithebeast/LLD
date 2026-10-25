package Behavioral_Design_Pattern.ObservalDesign;

import java.util.*;

public class ShubhamChannel {
    private String videoTitle;
    private String videoDescription;

    public String getVideoTitle() {
        return videoTitle;
    }

    public String getVideoDescription() {
        return videoDescription;
    }



    List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public  void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            // Notify each subscriber about the update
            subscriber.update(this);
            System.out.println("Notifying subscriber: ");
        }
    }

    public void uploadVideo(String videoTitle, String videoDescription) {
        this.videoTitle = videoTitle;
        this.videoDescription = videoDescription;
        System.out.println("Uploaded a new video: " + videoTitle + " - " + videoDescription);
        notifySubscribers();
    }

}
