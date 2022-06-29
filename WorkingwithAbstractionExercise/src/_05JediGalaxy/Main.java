package _05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static long sum = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int row = dimensions[0];
            int col = dimensions[1];

            int[][] matrix = new int[row][col];

            int value = 0;
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    matrix[i][j] = value++;
                }
            }

            String command = scanner.nextLine();
            while (!command.equals("Let the Force be with you"))
            {
                int[] ivoS = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
                int[] evil = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int evilRow = evil[0];
                int evilCol = evil[1];


                setEvil(evilRow,evilCol,matrix);
                int LineRow = ivoS[0];
                int LineCol = ivoS[1];

                move(LineRow,LineCol,matrix);
                command = scanner.nextLine();
            }
        System.out.println(sum);
    }

    private static void setEvil(int evilRow, int evilCol, int[][] matrix) {
        while (evilRow >= 0 && evilCol >= 0)
        {
            if (evilRow < matrix.length && evilCol < matrix[0].length)
            {
                matrix[evilRow] [evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static void move(int LineRow, int LineCol, int[][] matrix) {
        while (LineRow >= 0 && LineCol < matrix[0].length)
        {
            if (LineRow < matrix.length && LineCol >= 0)
            {
                sum += matrix[LineRow][LineCol];
            }
            LineCol++;
            LineRow--;
        }
    }
}
