import java.util.Scanner;

public class MagicSquareChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Utils.getLineToIntArray(sc);
        int rows = dimensions[0];
        int cols = dimensions[1];
        if (rows != cols) {
            return;
        }

        int[][] matrix = Utils.createIntMatrix(rows, cols, sc);
        boolean isMagicSquare = true;
        int sumDiagonalR = Integer.MIN_VALUE;
        int sumDiagonalL = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            int sumRow = Integer.MIN_VALUE;
            int sumCol = Integer.MIN_VALUE;
            for (int j = 0; j < cols; j++) {
                sumRow += matrix[i][j];
                sumCol += matrix[j][i];

            }
            if (sumRow != sumCol) {
                isMagicSquare = false;
                break;
            }
            sumDiagonalR += matrix[matrix.length - 1 - i][i];
            sumDiagonalL += matrix[i][i];
            if (i == rows - 1) {
                if (sumDiagonalR != sumDiagonalL || sumDiagonalL != sumRow) {
                    isMagicSquare = false;
                }
            }
        }


        System.out.println(isMagicSquare ? "True" : "False");
    }
}
