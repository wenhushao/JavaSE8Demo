/**
 * for 循环示例
 */
public class ForLoop {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 9};
        System.out.println("for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        //foreach
        System.out.println();
        System.out.println("foreach loop");
        for (int a : arr) {
            System.out.print(a + "\t");
        }
    }
}
