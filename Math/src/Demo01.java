public class Demo01 {
    public static void main(String[] args) {
        //使用java.lang包中Math类来处理数学运算
        //Math类是个工具类，所有的方法与属性都是静态的，可以直接使用类名调用

        //获取0到100以内的随机数
        double number = 100 * Math.random();
        System.out.println(number);
        //对获取的随机数进行四舍五入操作
        long num = Math.round(number);
        System.out.println(num);

    }
}
