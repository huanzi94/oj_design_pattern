# 命令模式

# 案例：

   假如万能遥控器，能操作电灯，电视，空调，支持开关功能。
   
# 案例角色：

- UniversalRemoteControl：万能遥控器，相当于调用者。
- Command：命令接口，定义能执行的必须的操作，供其他命令类去实现。
- LightOnCommand/LightOffCommand：电灯的命令实现类。
- TVONCommand/TVOffCommand：电视的命令实现类。
- NoCommand：撤销命令实现，对于空命令，做一个统一的处理类。
- LightRecever：电灯的命令接受者。
- TVRecever：电视的命令接受者。
  
# 案例实现方案：

UniversalRemoteControl类中聚合了各种Command，各种Command和数字是对应起来的。
