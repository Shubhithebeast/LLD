package Structural_Design_Pattern.ProxyDesign.localserver;

public class Main {

    public static void main(String[] args) {

          // Remote proxy - A remote proxy is a type of proxy that controls access to an object that is located in a different address space.
        // It acts as a local representative for the remote object, handling communication and network details.
        WeatherProxy weatherProxy = new WeatherProxy();
        System.out.println(weatherProxy.getWeather());
    }

}
