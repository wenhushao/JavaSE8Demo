public class Demo05 {
    public static void main(String[] args) {
        /*
        *使用java.lang包下的StringBuffer类与StringBuilder类，来更加高效的对字符串进行“追加新字符”的操作
        * StringBuffer类与StringBuilder都是引用类型，通过new来创建对象
        *
        * String类
        * 长度不可变的字符串
        * 进行拼接操作时，实际上是创建了一个新的字符串来代替原来的老字符串，所以“字符串追加操作”效率最低
        *
        * StringBuffer类
        * 线程安全、长度可变的字符串
        * 多线程操作时使用较多，进行“字符串追加操作”时效率较高
        *
        * StringBuilder类
        * 线程不安全、长度可变的字符串
        * 在单线程操中，进行“字符串追加操作”时效率最高
         */

        //创建两个空的可变长度字符串
        StringBuffer b1 = new StringBuffer();
        StringBuffer b2 = new StringBuffer(32);

        System.out.println(b1);
        System.out.println(b2);

        StringBuilder b3 = new StringBuilder("StringBuilder");
        System.out.println(b3);

        StringBuffer buffer = new StringBuffer("我喜欢学习");
        buffer.append("java");

        System.out.println(buffer);

        String str = buffer.toString();
        System.out.println(str);

    }
}
