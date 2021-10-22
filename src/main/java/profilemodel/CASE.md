# 案例：

   烧烤的过程都是一样的，比如先生火、准备食材、烧烤食物、食用，只是某个具体的方法实现可能不一样。

# 案例角色：

 - AbstractBarbecue：定义烧烤食物的方法和过程。
 - RoastedSweetPotatoes/RoastMeat：继承AbstractBarbecue，具体实现烧烤食物，定义烧烤具体的食物，定义烧烤方法的具体实现。
  
# 案例实现方案：

  AbstractBarbecue定义了烧烤食物的方法和过程，定义的过程是不能改变的，RoastedSweetPotatoes/RoastMeat继承AbstractBarbecue，
  是具体的烧烤食物的实现，比如烤肉烤红薯。
 
