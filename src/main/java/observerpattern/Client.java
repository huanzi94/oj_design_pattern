package observerpattern;

public class Client {
    public static void main(String[] args) {
        Weather station = new WeatherStation();
        station.registerSite(new SinaWebsiteObserver());
        station.registerSite(new TencentWebsiteObserver());

        station.setWeatherInfo(38L, 25L);
    }
}
