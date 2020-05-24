# JDBC
## JDBC概述
JDBC (Java Database Connectivity) 是Sun公司给出的一个Java语言访问关系数据库的Java接口标准。

- JDBC特点：
- 访问数据库数据的统一标准
- 支持访问几乎所有数据库
- 效率高

##JDBC作用
- JDBC技术：
1. 连接数据库
2. 读取数据库数据
3. 添加数据库数据
4. 修改数据库数据
5. 删除数据库数据 

## JDBC四大对象

- 数据库连接对象：java.sql.Connection
- 执行SQL对象：
- 执行静态SQL对象：java.sql.Statement 
- 执行预编译SQL对象：java.sql.PrepareStatement
- 执行结果对象：java.sql.ResultSet
## Connection对象的概述
- java.sql.Connection对象用于建立Java和数据库之间通信的桥梁。
## Connection对象的获取
1. 加载（mysql/oracle）JDBC的jar包
2. 注册驱动Class.forName(“com.mysql.jdbc.Driver”);
3. 建立连接
- url格式：
- JDBC:子协议:子名称//主机名:端口/数据库名？属性名=属性值&…
- 用户名、密码：
- User,password可以用“属性名=属性值”方式告诉数据库；
- 传输字符编码设置：
useUnicode=true&characterEncoding=UTF-8

