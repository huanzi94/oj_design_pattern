# 备忘录模式

# 案例：

  游戏中角色的状态恢复。

# 案例角色：

  - GameMemento：GameOriginator游戏角色的备忘录对象。
  - GameOriginator：具体的一个游戏角色。
  - GameCareTaker：GameMemento的管理者，聚合了多了多个GameMemento对象。

# 案例实现方案：

   GameCareTaker将会管理多个GameMemento对象，而GameMemento将会记录每一阶段GameOriginator的信息。
