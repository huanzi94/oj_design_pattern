# 访问者模式

# 案例：

软件包升级

# 案例角色：

- HardWare：硬件接口，软件包升级时，通过新的算法对硬件进行修复。
- Visitor：访问者接口。
- UpdatePackagesVisitor：实现了Visitor接口，软件升级包访问者。
- Robot：机器人类。

# 案例实现方案：

HardWare通过提供一个accept方法，用来接受访问者类，并将自身的传递给访问者，UpdatePackagesVisitor
拿到HardWare后，对其进行新的算法处理，从而达到硬件问题修复。


 
