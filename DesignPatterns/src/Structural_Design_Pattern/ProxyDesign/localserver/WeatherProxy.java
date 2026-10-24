package Structural_Design_Pattern.ProxyDesign.localserver;

import Structural_Design_Pattern.ProxyDesign.remoteserver.Weather;
import Structural_Design_Pattern.ProxyDesign.remoteserver.WeatherService;

public class WeatherProxy implements Weather {

    private Weather weather;

    public WeatherProxy() {
        this.weather = new WeatherService();
    }

    @Override 
    public String getWeather() {
        authenticate();
        openConnection();

        return sendHttpRequest();

    }
    
    private void authenticate() {
        // Authentication logic here
        System.out.println("Authenticating user...");
    }

    private void openConnection() {
        // Open connection logic here
        System.out.println("Opening connection...");
    }

    private String sendHttpRequest() {
        return weather.getWeather();
    }

}
