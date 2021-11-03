# 案例：

   克隆羊的实现。
  
# 案例实现方案：

### 1、 深拷贝（推荐）：

   Sheep需要实现Serializable,Cloneable接口，重写clone()方法，利用序列化和反序列化的方式实现深拷贝。

### 2、 浅拷贝：

   Sheep需要实现Cloneable接口，重写clone()方法，调用Object的clone()方法。这种写法对于对象属性不适用。

