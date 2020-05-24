import java.util.Base64;

public class Base64Encryption {
    public static void main(String[] args) {
        //Base64加密
        String s = "123456";
        String encode = Base64.getEncoder().encodeToString(s.getBytes());
        System.out.println(encode);

        //Base64解密
        byte[] decode = Base64.getDecoder().decode(s);
        System.out.println(new String(decode));
    }
}
