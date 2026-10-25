package Behavioral_Design_Pattern.StratergyDesign;

public class Push extends Notification {

    public Push(EncryptionStratergy encryptionStratergy, CompressionStratergy compressionStratergy) {
        super(encryptionStratergy, compressionStratergy);
    }

    @Override
    public void send() {
        System.out.println("Sending Push Notification");
    }


}
