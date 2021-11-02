# 享元模式

# 案例：

   画图功能。
  
# 案例实现方案：

   CircleShape需要继承Shape，定义具体的图形，ShapeFactory缓存了CircleShape对象，当
   要求画不同圆角的CircleShape时，先从缓存中获取CircleShape对象，然后在重新设置radius属性即可。

   #### 案例角色：

  - Shape：图形接口。
  - CircleShape：Shape的实现类，具体的图形。、圆形。
  - ShapeFactory：ShapeFactory缓存了CircleShape对象。