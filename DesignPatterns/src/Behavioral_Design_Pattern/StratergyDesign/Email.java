package Behavioral_Design_Pattern.StratergyDesign;

public class Email extends Notification {

    public Email(EncryptionStratergy encryptionStratergy, CompressionStratergy compressionStratergy) {
        super(encryptionStratergy, compressionStratergy);
    }

    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }


}
