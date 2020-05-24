public class Demo01 {
    public static void main(String[] args) {
        //直接使用""创建对象
        String str = "abcdef";
        //字符串是引用类型，通过new来创建对象
        String str2 = new String("abcdef");
        System.out.println("str原字符：" + str);
        System.out.println("str2原字符：" + str2);

        //调用length()方法，获取字符串的长度
        int length = str.length();
        System.out.println("str原字符长度：" + length);

        //调用equals()方法，判断两个字符串的内容是否相同
        boolean flag = str.equals(str2);
        System.out.println("判断str与str2是否相等：" + flag);

        //将str字符串中字母全变成大写
        String upStr = str.toUpperCase();
        System.out.println("str新字符：" + upStr);

        //将str字符串中字母全变成小写
        String lowStr = str.toLowerCase();
        System.out.println("str新字符：" + lowStr);
    }
}
