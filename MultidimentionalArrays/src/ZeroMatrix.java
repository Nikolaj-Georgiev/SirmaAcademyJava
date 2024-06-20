import java.util.Arrays;
import java.util.Scanner;

public class ZeroMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        int rows = dimensions[0];
        int cols = dimensions[1];
        if (rows != cols || cols == 0) {
            return;
        }
        int[][] matrix = new int[rows][cols];
        boolean[][] zeroIndexes = new boolean[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] matrixRow = Arrays.stream(sc.nextLine().split(" ")).toArray(String[]::new);
            for (int col = 0; col < cols; col++) {
                int currentInt = Integer.parseInt(matrixRow[col]);
                if (currentInt == 0) {
                    zeroIndexes[row][col] = true;
                }
                matrix[row][col] = currentInt;
            }
        }

        if (matrix.length != matrix[0].length) {
            return;
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (zeroIndexes[row][col]) {
                    for (int index = row; index <= row; index++) {
                        for (int index2 = 0; index2 < cols; index2++) {
                            matrix[row][index2] = 0;
                            matrix[index2][col] = 0;
                        }
                    }

                }
            }
        }

        Utils.printIntMatrix(matrix);
    }
}
