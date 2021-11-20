package observerpattern;

/**
 * 新浪站点，观察者角色
 */
public class SinaWebsiteObserver extends Observer {
    public float humidity;
    public float temperature;
    @Override
    void updateWeatherInfo(float humidity, float temperature) {
        this.humidity = humidity;
        this.temperature = temperature;
        System.out.println("--新浪预报天气信息为:");
        System.out.println("-----湿度：" + humidity + "   " + "温度：" + temperature);
    }
}
