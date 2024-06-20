import java.util.Arrays;
import java.util.Scanner;

public class MatrixBorderFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = Utils.createIntMatrix(rows, cols, sc);
        int[][] flippedMatrix = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);

        int prevElement = matrix[0][0];
        for (int j = 0; j < cols; j++) {
            int temp = flippedMatrix[0][j];
            flippedMatrix[0][j] = prevElement;
            prevElement = temp;
        }
        for (int i = 1; i < rows; i++) {
            int temp = flippedMatrix[i][rows - 1];
            flippedMatrix[i][rows - 1] = prevElement;
            prevElement = temp;
        }
        for (int j = cols - 2; j >= 0; j--) {
            int temp = flippedMatrix[rows - 1][j];
            flippedMatrix[rows - 1][j] = prevElement;
            prevElement = temp;
        }
        for (int i = rows - 2; i > 0; i--) {
            int temp = flippedMatrix[i][0];
            flippedMatrix[i][0] = prevElement;
            prevElement = temp;
        }

        flippedMatrix[0][0] = prevElement;

        Utils.printIntMatrix(flippedMatrix);

    }
}
