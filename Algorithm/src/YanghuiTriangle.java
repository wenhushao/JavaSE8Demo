/**
 * 杨辉三角
 */
public class YanghuiTriangle {
    public static void main(String[] args) {
        int i, j, n = 8, l, r;
        int a[] = new int[9];
        System.out.println(1);
        for (i = 1; i <= n; i++) {
            l = 1;
            System.out.print(1 + " ");
            for (j = 1; j <= i; j++) {
                r = a[j];
                /*每个数是上面两数之和*/
                a[j] = l + r;
                l = r;
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}