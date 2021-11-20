package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气气象站
 */
public class WeatherStation implements Weather {
    List<Observer> observers = new ArrayList<>();

    private float humidity;
    private float temperature;

    @Override
    public void setWeatherInfo(float humidity, float temperature) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyAllObservers();
    }

    @Override
    public void registerSite(Observer observer){
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    /**
     * 当天气信息有变化时，通知所有的观察者，更新自己的天气信息
     */
    private void notifyAllObservers() {
        observers.forEach(observer -> observer.updateWeatherInfo(this.humidity, this.temperature));
    }
}
