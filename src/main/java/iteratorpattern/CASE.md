# 迭代器模式

# 案例：

   假如学校下边信息工程系下边有学院：信工学院，金融学院。信工学院下边有系：信息工程系、网络安全系，
   金融学院下边有系：金融系、会计系。要求使用迭代器模式打印学校的组织结构信息。

# 案例角色：

 - Iterator：Java提供的一个迭代器接口。
 - InstituteScienceTechnologyIterator/SchoolFinanceIterator：信工学院/金融学院对应的迭代器，均实现了Iterator接口。
 - DepartmentInformationEngineering/NetworkSecurityDepartment：信息工程系/网络安全系。
 - DepartmentFinance/DepartmentAccounting：金融系/会计系。
 - InstituteScienceTechnology/SchoolFinance：信工学院/金融学院，实现了College接口。
 - College： 提供一个获取迭代器的方法。


  
# 案例实现方案：

  InstituteScienceTechnology/SchoolFinance实现了College接口，并且他们都有自己对应的迭代器
  InstituteScienceTechnologyIterator/SchoolFinanceIterator，对应的迭代器均实现了Iterator接口。
 
