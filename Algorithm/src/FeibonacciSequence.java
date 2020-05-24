/**
 * 斐波那切数列
 * 1 1 2 3 5 8 13 21 34 55 89 ..... 求第20个数字为
 */
public class FeibonacciSequence {
    public static void main(String[] args) {
        System.out.println("斐波那切数列");
        for (int i = 1; i <= 20; i++) {
            int num = function(i);
            System.out.print(num + " ");
        }
    }

    private static int function(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return function(n - 1) + function(n - 2);
        }
    }
}
