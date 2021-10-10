# 案例：

   假如有一个画图功能，有图形的抽象定义和画图的接口实现两部分组成。

# 案例角色：

 - Shape：图形的抽象层定义。
 - RefinedShape：图形的抽象层定义的实现，重新定义了图形的行为规则。
 - DrawShape：画图行为的接口定义。
 - CircleDrawShape/TriangleDrawShape：画图行为的接口定义的具体实现，分别实现了画圆形和三角形。
  
# 案例实现方案：

 RefinedShape实现抽象类Shape，新定义图形的行为规则。CircleDrawShape/TriangleDrawShape实现画图行为的接口定义DrawShape，分别具体实现画圆形和三角形。