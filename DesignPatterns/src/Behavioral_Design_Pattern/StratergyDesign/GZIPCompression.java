package Behavioral_Design_Pattern.StratergyDesign;

public class GZIPCompression implements CompressionStratergy {

    @Override
    public void compress() {
        System.out.println("GZIP Compressing Notification");
    }

}
