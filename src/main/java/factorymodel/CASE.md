# 工厂模式

# 案例：

   假如画图功能，要求根据不同的类型，画出不同的图形。
  
# 案例实现方案：

### 1、 简单工厂模式：

   CircleShape/TriangleShape需要实现Shape接口，重新定义具体图形的规则。ShapeFactory根据指定的类型，创建不同的图形对象。

   #### 案例角色：

   - Shape：图形接口，定义图形的规则。
   - CircleShape/TriangleShape：图形接口的实现，定义了具体的图形。
   - ShapeFactory：创建图形的工厂类，决定创建哪种图形对象。

### 2、 工厂方法模式：

   CircleShape/TriangleShape需要实现Shape接口，重新定义具体图形的规则。ShapeFactory定义创建对象的规则。
   TriangleShapeFactory/CircleShapeFactory继承ShapeFactory创建不同的图形对象。

   #### 案例角色：
   
   - Shape：图形接口，定义图形的规则。
   - CircleShape/TriangleShape：图形接口的实现，定义了具体的图形。
   - ShapeFactory：创建图形的工厂类，定义创建对象的规则。
   - TriangleShapeFactory/CircleShapeFactory：图形的工厂类的实现类，继承ShapeFactory创建不同的图形对象。
    
### 3、 抽象工厂模式：

   CircleShape/TriangleShape/OtherShape需要实现Shape接口，重新定义具体图形的规则。 ShapeFactory定义创建对象的规则。
   AbstractShapeFactory是一个顶级抽象工厂类，用于定义创建工厂的规则，ShapeFactory/OtherFactory继承 
   AbstractShapeFactory，根据不同的图形类型创建具体的图形对象。GenerateFactory用来包装AbstractShapeFactory工厂类，根据不同的工厂类型，
   获取对应的具体工厂类对象。

   #### 案例角色：
   
   - Shape：图形接口，定义图形的规则。
   - CircleShape/TriangleShape/OtherShape：图形接口的实现，定义了具体的图形。
   - ShapeFactory/OtherFactory：创建图形的工厂类，定义创建具体对象的规则。
   - AbstractShapeFactory：顶级抽象工厂类，用于定义创建工厂的规则。
   - GenerateFactory：获取对应的具体工厂类对象。
