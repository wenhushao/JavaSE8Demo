import java.util.Scanner;

public class InsertAlgorithm {
    public static void main(String[] args) {
        //插入算法
        int index = 0;
        String books[] = new String[]{"Computer", "Hibernate", "Java", "Struts"}; // 插入前数组
        String newBooks[] = new String[books.length + 1]; // 插入后新数组
        String book = null; // 保存用户输入的图书名称
        Scanner input = new Scanner(System.in);
        System.out.print("插入前数组："); // 输出插入前数组
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i] + " ");
        }
        System.out.println();
        System.out.print("请输入新书："); // 输入新元素
        book = input.next();
        for (int i = 0; i < books.length; i++) {
            if (books[i].compareToIgnoreCase(book) > 0) { // books[i]与book比较，找到插入位置
                index = i;
                break;
            }
        }
        for (int i = newBooks.length - 1; i > index; i--) { // 比较后插入新元素，原来元素后移
            newBooks[i] = books[i - 1];
        }
        for (int i = index - 1; i >= 0; i--) { // 补齐剩余原来元素
            newBooks[i] = books[i];
        }
        newBooks[index] = book;
        System.out.print("插入后数组：");
        for (int i = 0; i < newBooks.length; i++) {
            System.out.print(newBooks[i] + " ");
        }
    }
}