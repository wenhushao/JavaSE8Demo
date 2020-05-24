import java.util.HashMap;
import java.util.Scanner;

public class HashM {
    public static void main(String[] args) {
        /*
         * HashMap实现Map并扩展AbstractMap。同HashSet一样，HashMap中数据无序。
         * 特点：
         * 日常开发最常用的Map集合
         * 针对键取值效率非常高
         */

        //创建Map集合，定义泛型
        HashMap<String, String> hs = new HashMap<String, String>();
        //向集合中放入键值对
        hs.put("赵四", "谜一样的街舞男人");
        hs.put("刘能", "走路霸气的男人");
        hs.put("小沈阳", "这个人就是娘~啊这个人就是娘");
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        //根据key值获取集合中对应的value值
        System.out.println(hs.get(key));
    }
}
