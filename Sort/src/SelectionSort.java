/**
 * 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {25, 15, 42, 16, 12, 36};

        System.out.println("排序前数组为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int max = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            max = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[max] < a[j]) {
                    max = j;  //记下较大数位置，再次比较，直到最大
                }
            }
            if (i != max) {
                temp = a[i];
                a[i] = a[max];
                a[max] = temp;
            }
        }
        System.out.println();
        System.out.println("排序后数组为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
