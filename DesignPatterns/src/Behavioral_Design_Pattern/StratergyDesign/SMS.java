package Behavioral_Design_Pattern.StratergyDesign;

public class SMS implements Notification {

     @Override
    public void send() {
        System.out.println("Sending SMS Notification");
    }

    @Override
    public void encrypt() {
        System.out.println("AES Encrypting SMS Notification");
    }
    @Override
    public void compress() {
        System.out.println("GZIP Compressing SMS Notification");
    }

}
