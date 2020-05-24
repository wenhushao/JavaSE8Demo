public class Demo06 {
    public static void main(String[] args) {
        //字符串反转
        // StringBuffer reverse
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abcdefg");
        System.out.println(stringBuffer.reverse()); // gfedcba
        // StringBuilder reverse
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcdefg");
        System.out.println(stringBuilder.reverse()); // gfedcba

        System.out.println("====================================");

        String str=new String("abcdefg");
        System.out.println("str="+str);
        System.out.println("字符b在字符串的索引为"+str.indexOf("b"));
        System.out.println("字符串str的长度为"+str.length());
        byte[] strb=str.getBytes();
        for(int i=0;i<=strb.length;i++){
            System.out.println(strb[i]);
        }
    }
}
