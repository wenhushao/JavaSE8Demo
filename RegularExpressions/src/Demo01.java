import java.util.regex.Pattern;

public class Demo01 {
    public static void main(String[] args) {
        /*
         * 正则表达式定义了字符串的模式。
         * 正则表达式可以用来搜索、编辑或处理文本。
         * 正则表达式并不仅限于某一种语言，但是在每种语言中有细微的差别。
         */
        String content = "I am noob " + "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
    }
}
