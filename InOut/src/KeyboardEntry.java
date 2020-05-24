import java.util.Scanner;

public class KeyboardEntry {
    public static void main(String[] args) {
        //键盘输入
        Scanner input = new Scanner(System.in);
        System.out.print("输入一个数：A=");
        int a = input.nextInt();
        if (a > 0) {
            System.out.println("A>0");
        } else if (a < 0) {
            System.out.println("A<0");
        } else if (a == 0) {
            System.out.println("A=0");
        } else {
            System.out.println("输入错误");
        }
    }
}
