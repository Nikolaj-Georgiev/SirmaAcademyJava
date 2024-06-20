import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    public static int[][] createIntMatrix(int rows, int cols, Scanner sc) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] matrixRow = Arrays.stream(sc.nextLine().split(" ")).toArray(String[]::new);
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(matrixRow[col]);
            }
        }

        return matrix;
    }

    public static int[] getLineToIntArray(Scanner sc) {
        return Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    public static void printIntMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(STR."\{matrix[row][col]} ");
            }
            System.out.println();
        }
    }

    public static void printStringMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(STR."\{matrix[row][col]} ");
            }
            System.out.println();
        }
    }

    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] intRows : matrix) {
            for (int curInt : intRows) {
                sum += curInt;
            }
        }
        return sum;
    }

    public static int sumDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i] + matrix[matrix.length - 1 - i][i];
        }
        return sum;
    }

    public static String stringSumOfRows(int[][] matrix) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (result.isEmpty()) {
                result.append(sum);
            } else {
                result.append(", ").append(sum);
            }
        }
        return result.toString();
    }

    public static String stringSumOfCols(int[][] matrix) {
        StringBuilder result = new StringBuilder();
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        for (int i = 0; i < colLength; i++) {
            int sum = 0;
            for (int j = 0; j < rowLength; j++) {
                sum += matrix[j][i];
            }
            if (result.isEmpty()) {
                result.append(sum);
            } else {
                result.append(", ").append(sum);
            }
        }
        return result.toString();
    }
}
