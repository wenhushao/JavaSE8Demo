import java.util.Scanner;

/**
 * 提示输入一个数，求阶乘
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.print("请输入一个正整数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("无效数据!");
            return;
        }
        System.out.print(n + "!=");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
            if (i == n) {
                System.out.print(i + "=");
            } else {
                System.out.print(i + "x");
            }
            System.out.print(result);
        }
    }
}