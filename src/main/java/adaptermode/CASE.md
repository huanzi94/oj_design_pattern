# 案例：

   假如目前手机需要充电，但是家用插座的电压22V，而手机需要的电压5V，那么可以使用手机充电器进行电压转化，得到手机需要的电压5V。

# 案例角色：

 - PhoneVoltage：我们期望得到的接口。
 - HouseholdVoltage：被适配的对象。
 - PhonePharger：适配器。
  
# 案例实现方案：

### 1、 类适配器模式：

   PhonePharger需要继承HouseholdVoltage类，实现HouseholdVoltage向PhoneVoltage的转化。
 
### 2、 对象适配器：

   PhonePharger需要聚合HouseholdVoltage类，而不再是继承，实现HouseholdVoltage向PhoneVoltage的转化。
    
### 3、 接口适配器：

   PhonePharger需要聚合HouseholdVoltage类，而不再是继承。也不是直接实现PhoneVoltage接口，而是在两者之间增加抽象类AbstractVoltage，
   AbstractVoltage抽象类空实现PhoneVoltage接口的所有方法，由子类去继承抽象类AbstractVoltage，幷选择性的实现需要的方法，而不是实现全部方法。

