package observerpattern;

/**
 * 天气接口，设置天气信息
 */
public interface Weather {

    /**
     * 设置天气信息
     *
     * @param hmidity     湿度
     * @param temperature 温度
     */
    void setWeatherInfo(float hmidity, float temperature);

    /**
     * 提供一个注册观察者的方法，供子类去实现注册逻辑
     *
     * @param observer 观察者
     */
    void registerSite(Observer observer);
}
