public class Demo02 {
    public static void main(String[] args) {
        //使用 + 来连接两个字符串
        String str1 = new String("Hello,") + "Tom!";
        System.out.println(str1);

        //使用String类的concat()方法
        String str2 = "Hello,";
        String str3 = str2.concat("Tom!");
        System.out.println(str3);

    }
}
