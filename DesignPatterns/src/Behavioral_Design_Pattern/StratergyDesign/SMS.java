package Behavioral_Design_Pattern.StratergyDesign;

public class SMS extends Notification {

    public SMS(EncryptionStratergy encryptionStratergy, CompressionStratergy compressionStratergy) {
        super(encryptionStratergy, compressionStratergy);
    }

     @Override
    public void send() {
        System.out.println("Sending SMS Notification");
    }


}
