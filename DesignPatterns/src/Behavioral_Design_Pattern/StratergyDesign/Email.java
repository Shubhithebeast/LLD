package Behavioral_Design_Pattern.StratergyDesign;

public class Email implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }

    @Override
    public void encrypt() {
        System.out.println("AES Encrypting Email Notification");
    }
    @Override
    public void compress() {
        System.out.println("ZIP Compressing Email Notification");
    }

}
