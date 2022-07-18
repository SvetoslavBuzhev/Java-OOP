import java.util.Scanner;

public class _02SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int number = Integer.parseInt(scan.nextLine());
            if (number <= 0) {
                throw new IllegalArgumentException();
            }else {
                System.out.printf("%.2f%n",Math.pow(number,1.0/2));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
