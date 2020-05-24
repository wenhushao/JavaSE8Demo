# 集合
- ##数组的弊端：
- 必须定义长度！
- 无法改变长度！
- 不易得知数组中那个位置有数据，哪个位置还没填数据。

- ##集合类的特点：
- 无须定义长度！
- 动态地增加或减小长度！
- 处理数据更简单

## Collection接口
### Collection接口是集合框架最基础的接口，所以这个接口定义了整个集合框架都可以调用的方法，因此必须十分熟悉。

### 该接口下有两个分支：
- ### Set集合接口 
- 数据无序，值不可重复
- 日常工作中使用度不高
- ### List集合接口 
- 数据有序，值可以重复
- 日常工作中使用度高



## 集合的区别与联系

## List与Set
- List中的数据有顺序、值可以重复 
- Set中的数据无顺序、值不可重复
## ArrayList和LinkedList
- Arraylist对于遍历和随机读取位置值的效率较高
- LinkedList对与添加数据和删除数据效率较高
## HashSet和TreeSet
- HashSet添加值的效率较高
- TreeSet排序遍历值效率较高
## HashMap和TreeMap
- HashMap中数据没有顺序
- TreeMap中数据有固定顺序

## 其他
- ArrayList  有一个兄弟类 Vector 用法相似
- HashMap 有一个兄弟类 HashTable 用法相似
- ArrayList 和 HashMap   效率高，线程不安全 
- Vector 和 HashTable    效率低，线程安全

