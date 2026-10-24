package Structural_Design_Pattern.ProxyDesign;

public class MoviesProxy implements Video {

    private String fileName;
    private Video video;

    public MoviesProxy(String title) {
        System.out.println("Creating proxy for video: ");
        this.fileName = title;
    }     

    @Override
    public void play() {
        if(video == null)  video = new Movies(fileName);
        video.play();
    }
}
