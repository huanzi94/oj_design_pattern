# 观察者模式

# 案例：

天气预报

# 案例角色：

- Weather：天气接口，提供天气更新的方法。
- Observer：观察者抽象层。
- SinaWebsiteObserver/TencentWebsiteObserver：继承了Observer，具体的观察者。
- WeatherStation：实现了Weather接口，提供注册观察者的方法。

# 案例实现方案：

WeatherStation通过提供一个注册观察者的方法，用来接受具体的观察者，幷实现了更新天气的方法，当
天气信息更新时，通知具体的观察者执行相应的方法。


 
