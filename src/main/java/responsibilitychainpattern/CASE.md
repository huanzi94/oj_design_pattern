# 责任链模式

# 案例：

请假流程。

# 案例角色：

- Handler：请求处理者接口。
- ProjectManagerHandler/HoDHandler/TerritoryManagerHandler/CEOHandler：项目经理处理者，
  部门经理处理者，地域经理处理者，CEO处理者，具体的请求处理者实现。
- Context：聚合Handler。
  
# 案例实现方案：

ProjectManagerHandler/HoDHandler/TerritoryManagerHandler/CEOHandler具体的请求处理者，都实现了Handler接口，每个处理
者都知道下一步处理者。
