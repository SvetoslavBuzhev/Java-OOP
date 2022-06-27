package _02PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] coordinates = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Point bottomLeft = new Point(coordinates[0],coordinates[1]);
        Point topRight = new Point(coordinates[2],coordinates[3]);

        Rectangle rectangle = new Rectangle(bottomLeft,topRight);

        int rowsToRead = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rowsToRead; i++) {
            int[] currentCoordinates = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Point currentPoint = new Point(currentCoordinates[0],currentCoordinates[1]);
            System.out.println(rectangle.Contains(currentPoint));
        }
    }
}
