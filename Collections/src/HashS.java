import java.util.HashSet;
import java.util.Iterator;

public class HashS {
    public static void main(String[] args) {
        /*
         * HashSet使用散列表进行存储。
         * 特点：
         * 长度可变，无限大
         * 没有重复值
         * 数据无序
         * 不便于展示集合内信息，需要使用迭代器。
         * 日常开发使用度很低
         */
        HashSet<String> hs = new HashSet<String>();
        hs.add("赵四");
        hs.add("刘能");
        hs.add("刘能");
        hs.add("豁牙子");
        //迭代器
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
