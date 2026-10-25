package Behavioral_Design_Pattern.StratergyDesign;

public abstract class Notification {

    EncryptionStratergy encryptionStratergy;
    CompressionStratergy compressionStratergy;

    public Notification(EncryptionStratergy encryptionStratergy, CompressionStratergy compressionStratergy) {
        this.encryptionStratergy = encryptionStratergy;
        this.compressionStratergy = compressionStratergy;
    }
    
    public void encrypt() {
        encryptionStratergy.encrypt();
    }

    public void compress() {
        compressionStratergy.compress();
    }

    abstract void send();

}
