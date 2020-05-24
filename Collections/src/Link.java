import java.util.LinkedList;

public class Link {
    public static void main(String[] args) {
        /*
         * LinkedList基本用法与ArrayList一致，采用链表存储方式
         * 特点：
         * 长度可变，无限大
         * 遍历元素效率比ArrayList低
         * 随机访问元素效率比ArrayList低
         * 插入、删除元素效率比ArrayList高
         * 日常开发使用度低
         *
         * 泛型：
         * 在集合中用于规定集合中只可以放哪种类型数据
         * 提高程序的安全性和健壮性
         * 消除了绝大多数的类型转换
         * 提高程序可读性、维护性。
         */

        //创建LinkedList集合 定义泛型
        LinkedList<String> link1 = new LinkedList<String>();
        link1.add("值1");
        link1.addFirst("值2");
        link1.addLast("值3");
        link1.add("值4");
        link1.removeLast();
        System.out.println("Link1:");
        for (String str : link1) {
            System.out.print(str + " ");
        }
    }
}
