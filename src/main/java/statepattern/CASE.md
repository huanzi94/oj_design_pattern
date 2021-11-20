# 状态模式

# 案例：

窗口叫号办理业务。

# 案例角色：

- Context：聚合了State，客户端使用context获取当前状态下的信息。
- State：状态接口。
- ToBeCalledState/CalledState/EndCalledState：实现了State接口，定义具体的状态，并且指定该状态下具体行为。

# 案例实现方案：

ToBeCalledState/CalledState/EndCalledState实现了State接口，定义具体的状态，并且指定该状态下具体行为，
Context聚合了State，客户端使用context获取当前状态下的信息。

 
