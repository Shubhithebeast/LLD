package Behavioral_Design_Pattern.StratergyDesign;

public class Main {

    public static void main(String[] args) {

        // Strategy Design  is a behavioral design pattern that allows selecting an algorithm's behavior at runtime.

        Notification emailNotification = new Email(new RSAEncryption(), new GZIPCompression());
        Notification smsNotification = new SMS(new AESEncryption(), new GZIPCompression());
        Notification pushNotification = new Push(new RSAEncryption(), new GZIPCompression());

        emailNotification.encrypt();
        emailNotification.compress();
        emailNotification.send();

        smsNotification.encrypt();
        smsNotification.compress();
        smsNotification.send();

        pushNotification.encrypt();
        pushNotification.compress();
        pushNotification.send();

    }

}
