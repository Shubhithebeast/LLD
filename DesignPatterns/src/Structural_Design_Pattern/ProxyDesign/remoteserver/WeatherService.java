package Structural_Design_Pattern.ProxyDesign.remoteserver;

public class WeatherService implements Weather {
    
    @Override
    public String getWeather() {
        return "Sunny";
    }

}
