public class Demo04 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("str=" + str);

        //返回从索引3开始到最后的子串
        String str1 = str.substring(3);
        System.out.println("str1=" + str1);

        //返回从索引2开始到索引5结束的子串
        String str2 = str.substring(2, 5);
        System.out.println("str2=" + str2);
        System.out.println();

        String string1 = "aaa";
        String string2 = "aaa";
        String string3 = new String("aaa");
        String string4 = new String("aaa");

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
        System.out.println(string3 == string4);
        System.out.println(string3.equals(string4));

        /*
         * 1、首先string1和string2都指向同一个对象aaa，它们调用==和X.equals(Y)方法其效果是一样的
         * 2、而string3和string4是在堆中创建两个新对象，它们引用的地址是不同的，
         * 从而使得==出现不相等的情况，
         * 而X.equals(Y)当X和Y所引用的对象是同一类对象且属性内容相等（并不一定是相同对象）时返回true，
         * 就出现了上面的结果
         */
    }
}
