import java.util.Arrays;
import java.util.Scanner;

public class _01NumberInRange {
    public static boolean notValid = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] range = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.printf("Range: [%d...%d]%n", range[0], range[1]);

        int number = 0;

        while (notValid) {
            String input = scan.nextLine();
            try {
                number = Integer.parseInt(input);
                extracted(range, number);
            }catch (IllegalArgumentException e){
                System.out.println("Invalid number: " + input);
            }
        }
    }

    private static void extracted(int[] range, int number) {
        if (number < range[0]|| number > range[1]){
            throw new IllegalArgumentException();
        }else {
            System.out.println("Valid number: " + number);
            notValid = false;
        }
    }
}
