package Behavioral_Design_Pattern.StratergyDesign;

public class ZIPCompression implements CompressionStratergy {

    @Override
    public void compress() {
        System.out.println("ZIP Compressing Notification");
    }

}
