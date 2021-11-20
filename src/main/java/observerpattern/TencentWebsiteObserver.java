package observerpattern;

/**
 * 腾讯站点，观察者角色
 */
public class TencentWebsiteObserver extends Observer {

    private float humidity;
    private float temperature;

    @Override
    void updateWeatherInfo(float humidity, float temperature) {
        this.humidity = humidity;
        this.temperature = temperature;
        System.out.println("--腾讯预报天气信息为:");
        System.out.println("-----湿度：" + humidity + "   " + "温度：" + temperature);
    }
}