# 外观模式

# 案例：

   画图功能。
  
# 案例实现方案：

   TriangleShape/CricleShape/RhombusShape需要继承Shape，定义具体的图形，ShapeMaker聚合
   了TriangleShape/CricleShape/RhombusShape，对外提供画不同的图形的功能，最终在内部调用了
   具体的图形类的画图方法完成了实际上的功能。

   #### 案例角色：

  - Shape：图形接口。
  - TriangleShape/CricleShape/RhombusShape：Shape的实现类，具体的图形。三角形、圆形、菱形。
  - ShapeMaker：外观类，客户端只需要访问这个外观类就可以画出自己想要的图形。


