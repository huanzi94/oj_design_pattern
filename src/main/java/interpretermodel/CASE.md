# 解释器模式

# 案例

比如要sql语句的解析。

# 案例角色：

- Expression：Expression是一个接口，定义解释器的接口方法。
- SQLAExprssion/SQLBExprssion：实现了Expression接口，定义了不同的语法解析规则。
- Context：语法解析用到的辅助的类。

# 案例实现方案：

SQLAExprssion/SQLBExprssion，实现了Expression接口，定义了不同的语法解析规则。
