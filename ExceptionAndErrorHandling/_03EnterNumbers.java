import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03EnterNumbers {
    public static List<Integer> tenNumbers = new LinkedList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = 0;
        int start = 1;
        while (tenNumbers.size() < 10) {
            try {
                number = Integer.parseInt(scan.nextLine());
                try {
                    readNumber(start, 100, number);
                    start++;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number!");
            }

        }
        System.out.println(tenNumbers
                .stream()
                .sorted()
                .map(e -> String.format(String.valueOf(e)))
                .collect(Collectors.joining(", ")));

    }

    private static void readNumber(int start, int end, int number) {
        if (number <= start || number >= end) {
            throw new IllegalArgumentException(String.format("Your number is not in range %d - 100!", start));
        }
        tenNumbers.add(number);
    }
}
