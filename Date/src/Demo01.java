import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        //使用java.util包下的Date类来处理时间

        //创建本地当前时间所对应的时间对象
        Date date = new Date();

        //打印时间对象
        System.out.println(date);

        //打印时间对象所对应的毫秒数
        System.out.println(date.getTime());

        //获取1小时之后的毫秒数
        long time = date.getTime() + 3600000;
        //使用给定的毫秒数来创建时间对象
        Date date1 = new Date(time);

        System.out.println(date1.toString());
        System.out.println(date1.getTime());

    }
}
