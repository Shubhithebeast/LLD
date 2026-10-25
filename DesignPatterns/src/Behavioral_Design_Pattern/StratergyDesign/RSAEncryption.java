package Behavioral_Design_Pattern.StratergyDesign;

public class RSAEncryption implements EncryptionStratergy {
    @Override
    public void encrypt() {
        System.out.println("RSA Encrypting Notification");
    }
}
