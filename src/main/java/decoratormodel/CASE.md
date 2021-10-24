# 案例：

   假如顾客在点饮料的时候，可能需要加料，比如：牛奶、红豆、水果。
  
# 案例实现方案：

   MilkyTea/Coke/Juice需要继承Drink，创建奶茶/可乐/果汁等被装饰者。FoodstuffDecorator继承Drink，定义具体的装饰者抽象层，提取
   了装饰者的一些公共内容，MilkDecorator/OrmosiaDecorator/FruitDecorator：牛奶、红豆、水果，具体的装饰者。

   #### 案例角色：

   - Drink：饮料，抽象层，装饰者和被装饰者都需要继承。
   - MilkyTea/Coke/Juice：奶茶/可乐/果汁，具体的饮料，角色为被装饰者。
   - FoodstuffDecorator：食料，装饰者抽象层。
   - MilkDecorator/OrmosiaDecorator/FruitDecorator：牛奶、红豆、水果，具体的食料，角色为装饰者。


