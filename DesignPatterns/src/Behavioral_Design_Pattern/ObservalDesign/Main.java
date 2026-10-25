package Behavioral_Design_Pattern.ObservalDesign;

public class Main {

    public static void main(String[] args) {

        // Observer pattern - Is is design pattern where one particular object automatically notifies multiple objects
        //  whenever any change or any events occurs.

        ShubhamChannel channel = new ShubhamChannel();
        YoutubeSubs sub1 = new YoutubeSubs("Alice", 1);
        YoutubeSubs sub2 = new YoutubeSubs("Bob", 2);

        channel.subscribe(sub1);
        channel.subscribe(sub2);

        channel.uploadVideo("New Video Title", "New Video Description");


    }   

}
