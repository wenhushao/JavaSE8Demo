public class Rhombus {
    public static void main(String[] args) {
        // 输出8行的菱形
        int size = 8;
        if (size % 2 == 0) {
            // 计算菱形大小
            size++;
        }
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                // 输出左上角位置的空白
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                // 输出菱形上半部边缘
                System.out.print("*");
            }
            // 换行
            System.out.println();
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                // 输出菱形左下角空白
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                // 输出菱形下半部边缘
                System.out.print("*");
            }
            // 换行
            System.out.println();
        }
    }
}