package observerpattern;

/**
 * 观察者抽象层
 */
public abstract class Observer {

    /**
     * 定义一个更新天气信息的方法，供子类去实现
     * @param humidity 湿度
     * @param temperature 温度
     */
    abstract void updateWeatherInfo(float humidity, float temperature);
}
