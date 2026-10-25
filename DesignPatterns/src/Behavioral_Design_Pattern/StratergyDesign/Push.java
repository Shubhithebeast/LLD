package Behavioral_Design_Pattern.StratergyDesign;

public class Push implements Notification {

     @Override
    public void send() {
        System.out.println("Sending Push Notification");
    }

    @Override
    public void encrypt() {
        System.out.println("RSA Encrypting Push Notification");
    }
    @Override
    public void compress() {
        System.out.println("GZIP Compressing Push Notification");
    }

}
