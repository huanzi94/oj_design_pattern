# 代理模式

# 案例

有一个业务模块的方法(login())已经运行了很久了，要求增加在不更改源代码的前提下，给这个这个方法执行前后增加日志打印。

# 案例角色：

- Login：Login是一个接口。
- ModelALogin：实现了Login接口。
- ProxyModelALogin：ModelALogin的代理类，会在执行ModelALogin的login()的前后增加日志打印。

# 案例实现方案：

ProxyModelALogin，ModelALogin的代理类，会在执行ModelALogin的login()的前后增加日志打印。
