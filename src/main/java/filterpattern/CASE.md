# 过滤器模式

# 案例：

   假如有一些不同形状的不同颜色不同大小的气球，现在可能每个场景需要各自的气球，那么需要将这些气球按照不同的场景分离出来。
   
# 案例实现方案：

   ColorBalloonFilter/SizeBalloonFilter/ShapeBalloonFilter，Filter的实现类，具体的过滤器。定义不同的过滤规则。

   #### 案例角色：

- Balloon：气球类。
- Filter：过滤器接口。
- ColorBalloonFilter/SizeBalloonFilter/ShapeBalloonFilter：Filter的实现类，具体的过滤器。
- BalloonFactory：气球工厂，主要用于产生气球。