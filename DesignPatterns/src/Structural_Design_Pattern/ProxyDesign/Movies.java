package Structural_Design_Pattern.ProxyDesign;

public class Movies implements Video {

    private String fileName;

    public Movies(String title) {
        this.fileName = title;
        loadVideo();
    }

    private void loadVideo() throws RuntimeException {
        try {
            System.out.println("Loading video from server");
            Thread.sleep(2000); // Simulate loading time
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to load video", e);
        }   
    }       

    @Override
    public void play() {
        System.out.println("Playing movie: " + fileName);
    }
}
