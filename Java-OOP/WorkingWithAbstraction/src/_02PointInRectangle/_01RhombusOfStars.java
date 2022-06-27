import java.util.Scanner;

public class _01RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int scanInt = scan.nextInt();

        printRhombus(scanInt);
    }

    private static void printRhombus(int scanInt) {
        for (int i = 1; i <= scanInt; i++) {
            printRow(i,scanInt);
            System.out.println();
        }
        for (int i = scanInt-1; i > 0; i--) {
            printReverseRow(scanInt,i);
            System.out.println();
        }
    }

    private static void printReverseRow(int scanInt, int i) {
        for (int j = i; j < scanInt ; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
    }

    private static void printRow(int i, int scanInt) {
        for (int j = i; j < scanInt; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < i; k++) {
            System.out.print("* ");
        }
    }
}
