import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        /*
         * ArrayList实现了长度可变的数组，在内存中分配连续的空间。
         * 特点：
         * 长度可变，无限大
         * 遍历元素效率高
         * 随机访问元素效率高
         * 日常开发最常用的集合
         */

        //创建ArrayList集合
        ArrayList arr1 = new ArrayList();
        //添加元素
        arr1.add(1);
        arr1.add(2);
        arr1.add(5);
        arr1.add(1, 8);
        System.out.println("Arr1:");
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
        System.out.println("Arr2:");
        ArrayList arr2 = new ArrayList();
        arr2.add("嘿嘿");
        arr2.add("呵呵");
        arr2.add("哈哈");
        arr2.add(1, "啦啦啦");
        arr2.set(2, "嘻嘻");
        arr2.remove(0);
        arr2.remove("嘻嘻");
        for (int i = 0; i < arr2.size(); i++) {
            System.out.print(arr2.get(i) + " ");
        }
    }
}
