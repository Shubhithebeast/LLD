package Behavioral_Design_Pattern.StratergyDesign;

public class AESEncryption implements EncryptionStratergy {
    @Override
    public void encrypt() {
        System.out.println("AES Encrypting Notification");
    }
}
