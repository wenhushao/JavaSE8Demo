import java.util.Arrays;

/**
 * 冒泡排序
 * 工具类版
 */

public class BubbleSortTool {
    public static void main(String[] args) {
        int arr[] = {6, 3, 8, 2, 9, 1};
        System.out.println("排序前数组为：");
        //for遍历输出
        for (int num : arr) {
            System.out.print(num + " ");
        }
        //工具类：默认是升序
        Arrays.sort(arr);
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
