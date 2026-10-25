package Behavioral_Design_Pattern.ObservalDesign;

public class YoutubeSubs implements Subscriber {

    private String name;
    private int id;

    public YoutubeSubs(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void update(ShubhamChannel channel) {
        System.out.println("Subscriber " + name + " with ID " + id + " has been notified about the video: " + channel.getVideoTitle() + " - " + channel.getVideoDescription());
    }   

}
