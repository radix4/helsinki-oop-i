/**
 * This program prints different shapes using stars.
 * @author  Thang Cao
 * @since   06/19/2020
 * */

public class PrintingLikeBoss {

    public static void printStars(int amount) {
        int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed = printed + 1;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
    }

    public static void xmasTree(int height) {
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
