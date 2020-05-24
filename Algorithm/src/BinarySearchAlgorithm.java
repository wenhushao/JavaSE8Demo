/**
 * 二分查找法
 * 1.二分查找又称折半查找，它是一种效率较高的查找方法。
 * 2.二分查找要求(前提)：
 * （1）必须采用顺序存储结构
 * （2）.必须按关键字大小有序排列
 * 3.原理：将数组分为三部分，依次是中值（所谓的中值就是数组中间位置的那个值）前，中值，中值后；
 * 将要查找的值和数组的中值进行比较，若小于中值则在中值前面找，若大于中值则在中值后面找，等于中值时直接返回。
 * 然后依次是一个递归过程，将前半部分或者后半部分继续分解为三部分。
 */

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 9, 10, 44, 78, 101, 203, 500};
        int index = binarySearch(array, 78);
        System.out.println("数组为：");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.println("查找78的索引为：" + index);
    }

    /**
     * 循环实现二分查找算法arr已排好序的数组x需要查找的数-1无法查到数据
     */
    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (x == arr[middle]) {
                return middle;
            } else if (x < arr[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
