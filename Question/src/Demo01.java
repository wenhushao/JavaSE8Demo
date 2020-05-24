/**
 * 有一个字符串，其中包含中文字符、英文字符和数字字符，请统计和打印出各个字符的个数
 */

public class Demo01 {
    public static void main(String[] args) {
        String str = "中国aadf的111萨bbb菲的zz萨菲";
        int engishCount = 0;
        int chineseCount = 0;
        int digitCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                engishCount++;
            } else {
                chineseCount++;
            }
        }
        System.out.println("英文字符:" + engishCount);
        System.out.println("中文字符:" + chineseCount);
        System.out.println("数字字符:" + digitCount);
    }
}
