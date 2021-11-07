# 建造者模式

# 案例：

   假如实现汉堡套餐的制作

# 案例角色：

 - Hamburg：汉堡的抽象层定义。
 - Drink：饮料的抽象层定义。
 - KFCBuilder： 汉堡套餐的抽象定义。
 - BurgerPackage：汉堡套餐的定义。
 - KFCDirector：汉堡套餐的指挥者，用于指定套餐的制作流程。
 - BeefPepsiKFCBuilder/ChickenCokeKFCBuilder：牛肉百事可乐汉堡套餐建造者，鸡肉可口可乐汉堡套餐建造者。
 - ChickenHamburgers/BeefHamburgers：具体的汉堡实现，鸡肉汉堡牛肉汉堡。
 - Coke/Pepsi：具体的饮料实现，可口可乐百事可乐。
  
# 案例实现方案：

 RefinedShape实现抽象类Shape，新定义图形的行为规则。CircleDrawShape/TriangleDrawShape实现画图行为的接口定义DrawShape，分别具体实现画圆形和三角形。
