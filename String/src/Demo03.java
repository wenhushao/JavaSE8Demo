public class Demo03 {
    public static void main(String[] args) {
        String str = "HelloWorld.java";

        //打印结果为：4 注：索引从0开始计数
        System.out.println(str.indexOf('o'));

        //HelloWorld.java字符串是否以 h 开头：false
        boolean start_h = str.startsWith("h");
        System.out.println(str + "字符串是否以 h 开头：" + start_h);

        //HelloWorld.java字符串是否以 .java 结尾：true
        boolean end_java = str.endsWith(".java");
        System.out.println(str + "字符串是否以 .java 结尾：" + end_java);
    }
}
