# 策略模式

# 案例：

猫比较大小，可以根据体重比较大小，也可以根据身高比较大小。

# 案例角色：

- Context：聚合了Strategy，客户端使用context获取比较结果。
- Strategy：策略接口。
- HeightStrategy/WeightStrategy：实现了Strategy接口，定义具体的比较策略。

# 案例实现方案：

HeightStrategy/WeightStrategy实现了Strategy接口，定义具体的比较策略,
Context聚合了Strategy，客户端使用context获取比较结果。

 
