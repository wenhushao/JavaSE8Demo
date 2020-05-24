import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        /*
         * TreeSet就是数据有序的HashSet集合。散列表
         * 特点：
         * 长度可变，无限大
         * 没有重复值
         * 数据按照升序排列
         * 不便于展示集合内信息，需要使用迭代器。
         * 日常开发使用度很低
         */
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("赵四");
        ts.add("刘能");
        ts.add("刘能");
        ts.add("豁牙子");
        //迭代器
        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
